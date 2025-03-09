package com.example.javaeightprograms.Threads;

import java.io.*;

class UserSession implements Serializable {
    // Regular serializable field
    private String username;

    // Transient field - won't be serialized
    private transient String sensitiveToken;

    // Volatile field - ensures visibility across threads
    private volatile boolean isActive;

    // Timestamp of last access
    private volatile long lastAccessTime;

    public UserSession(String username, String sensitiveToken) {
        this.username = username;
        this.sensitiveToken = sensitiveToken;
        this.isActive = true;
        this.lastAccessTime = System.currentTimeMillis();
    }

    // Method to demonstrate transient field behavior
    public void displayFields() {
        System.out.println("Username: " + username);
        System.out.println("Token: " + sensitiveToken);
        System.out.println("Is Active: " + isActive);
        System.out.println("Last Access: " + lastAccessTime);
    }

    // Simulated activity checker thread
    private Thread activityChecker = new Thread(() -> {
        while (true) {
            if (System.currentTimeMillis() - lastAccessTime > 300000) { // 5 minutes
                isActive = false;  // volatile write
                break;
            }
            try {
                Thread.sleep(10000); // Check every 10 seconds
            } catch (InterruptedException e) {
                break;
            }
        }
    });

    public void startActivityChecking() {
        activityChecker.start();
    }

    public void updateLastAccess() {
        lastAccessTime = System.currentTimeMillis();  // volatile write
    }

    public boolean isSessionActive() {
        return isActive;  // volatile read
    }
}

public class TransientVolatileDemo {
    public static void main(String[] args) {
        // Create a user session
        UserSession session = new UserSession("john_doe", "secret_token_123");
        System.out.println("Original session:");
        session.displayFields();

        // Demonstrate transient serialization
        try {
            // Serialize
            FileOutputStream fileOut = new FileOutputStream("session.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(session);
            out.close();
            fileOut.close();

            // Deserialize
            FileInputStream fileIn = new FileInputStream("session.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            UserSession deserializedSession = (UserSession) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("\nDeserialized session (note the null token):");
            deserializedSession.displayFields();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Demonstrate volatile with multiple threads
        session.startActivityChecking();

        // Simulate user activity
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(2000);
                session.updateLastAccess();
                System.out.println("\nSession active: " + session.isSessionActive());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
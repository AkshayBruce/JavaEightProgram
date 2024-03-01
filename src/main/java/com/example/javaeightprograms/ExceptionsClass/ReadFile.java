package com.example.javaeightprograms.ExceptionsClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.EmptyStackException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args)
    {
        try {
           // readFile("C:\\Users\\bruce\\Downloads");

            checkFileNotEmpty("test.txt");
            System.out.println("File is not empty...");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(EmptyFileException e)
        {
            System.out.println("Error: "+ e.getMessage());
        }
    }

    public static void checkFileNotEmpty(String fileName) throws EmptyStackException, EmptyFileException, FileNotFoundException {
        File file = new File(fileName);

        Scanner scan = new Scanner(file);

        if(!scan.hasNextLine())
        {
            scan.close();

            throw new EmptyFileException("File is empty...");
        }

        scan.close();
    }

    public static void readFile(String filename) throws FileNotFoundException
    {
        File file = new File(filename);

        Scanner scan = new Scanner(file);


        while (scan.hasNextLine())
        {
            String line = scan.nextLine();
            System.out.println(line);
        }

        scan.close();
    }
}

class EmptyFileException extends Exception{
    public EmptyFileException(String message)
    {
        super(message);
    }
}

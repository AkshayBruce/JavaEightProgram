package com.example.javaeightprograms.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

    public static void main(String args[]) {
        /* Vector of initial capacity(size) of 2 */
        Vector<String> vec = new Vector<String>(2);

        /* Adding elements to a vector*/
        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        /* check size and capacityIncrement*/
        System.out.println("Size is: "+vec.size());
        System.out.println("Default capacity increment is: "+vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");

        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: "+vec.size());
        System.out.println("Capacity after increment is: "+vec.capacity());
        vec.addElement("fruit5");
        vec.addElement("fruit6");
        vec.addElement("fruit7");
        vec.addElement("fruit8");


        /*size and capacityIncrement after two insertions*/
        System.out.println("Size after addition: "+vec.size());
        System.out.println("Capacity after increment is: "+vec.capacity());


            /*Display Vector elements*/
            Enumeration en = vec.elements();
            System.out.println("\nElements are:");
            while(en.hasMoreElements())
                System.out.print(en.nextElement() + " ");
        }
}

package com.example.javaeightprograms.Vector;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();

        for (int i = 10; i < 15; i++) {
            vector.add(i);
            }

        System.out.println("Vector elements:"+ vector);

        Vector<Complex> vectorComplex = new Vector<Complex>();

        vectorComplex.add(new Complex(10,11));
        vectorComplex.add(new Complex(12,13));

        System.out.println("Vector Elements:");
        for (Complex c: vectorComplex)
        {
            c.printComplex();
         }

    }
}

class Complex
{
    int real;
    int imaginary;

    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplex()
    {
        System.out.println("Complex number:" + real + " " + imaginary+ "i");
    }
}

package DSA.NumberSystem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int decimal = scan.nextInt();
        scan.close();

        String binary = "";

        if(decimal == 0)
        {
            binary = "0";
        }else
        {
            while(decimal > 0)
            {
                int remainder =  decimal % 2;

                binary  = remainder + binary;
                 decimal = decimal/2;
            }
        }

        System.out.println("Binary Representation: " + binary);
    }
}

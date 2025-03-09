package DSA.NumberSystem;

import java.util.Scanner;

public class DecToHexa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        scanner.close();

        // Array to store hexadecimal digits
        char[] hex = new char[20];
        int index = 0;

        if(decimal == 0)
        {
            System.out.println("Hexadecimal representation: 0");
        }else
        {
            int remainder;
            while(decimal != 0)
            {
                remainder = decimal % 16;
                if(remainder < 10)
                {
                    hex[index] = (char)(remainder + '0');
                } else
                {
                    hex[index] =  (char) (remainder - 10 + 'A');
                }
                index++;
                decimal = decimal / 16;
            }

            // Print the hexadecimal number in reverse order
            System.out.print("Hexadecimal representation: ");
            for (int i = index - 1; i >=0 ; i--) {
                System.out.print(hex[i]);
            }
            System.out.println();
        }
    }
}
/**
 *
 * */
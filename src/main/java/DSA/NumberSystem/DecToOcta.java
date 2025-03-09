package DSA.NumberSystem;

import java.util.Scanner;

public class DecToOcta {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter a decimal number:");
        int decimal = scan.nextInt();
        scan.close();

        String octa = "";
        if(decimal == 0)
        {
            octa = "0";
        }else
        {
            int tempDecimal =  decimal;
            while (tempDecimal > 0)
            {
                int remainder  =  tempDecimal % 8;
                octa = remainder + octa;
                tempDecimal = tempDecimal /8;
            }
        }
        System.out.println("Octal Presentation: " + octa);
    }
}

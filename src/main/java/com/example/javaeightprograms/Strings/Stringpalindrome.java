package com.example.javaeightprograms.Strings;

public class Stringpalindrome {
    public static void main(String[] args) {
        String checkString = "abbbbabbbba";

        System.out.println(isPalindrome(checkString));
    }

    static boolean isPalindrome(String str)
    {
        if(str ==null || str.length() ==0)
        {
            return true;
        }

        str = str.toLowerCase();
        System.out.println(str.length()/2);
        for (int index = 0; index <= str.length()/2; index++) {
            char start = str.charAt(index);
            char end = str.charAt(str.length()- 1 - index);

            if(start!=end)
            {
                return false;
            }
        }
        
        return true;
    }
}

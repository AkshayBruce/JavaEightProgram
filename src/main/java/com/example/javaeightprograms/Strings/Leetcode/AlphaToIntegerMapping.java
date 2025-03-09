package com.example.javaeightprograms.Strings.Leetcode;

public class AlphaToIntegerMapping {
    public static void main(String[] args) {

        System.out.println(decodeString("10#11#12#"));
        System.out.println(decodeString("1326"));
    }

    public static String decodeString(String s)
    {
        StringBuilder result = new StringBuilder();

        int i = 0;

        while(i < s.length())
        {
            if(i + 2 < s.length() && s.charAt(i + 2) == '#')
            {
                String numStr = s.substring(i, i+2);
                int num = Integer.parseInt(numStr);
                char decodedChar = (char) ('j' + num - 10);
                result.append(decodedChar);

                i +=3;

            }else
            {
                char decodedChar = (char) ('a' + (s.charAt(i) - '1'));
                result.append(decodedChar);
                i +=1;
            }
        }
        return  result.toString();
    }
}

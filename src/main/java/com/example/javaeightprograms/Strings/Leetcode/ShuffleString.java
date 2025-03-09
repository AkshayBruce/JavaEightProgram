package com.example.javaeightprograms.Strings.Leetcode;

public class ShuffleString {

    public static void main(String[] args) {

        String word ="codeleet";
        int[] indices = {4,5,6,7,0,1,2,3};

        System.out.println(shuffletheString(word, indices));
    }

    public static String shuffletheString(String word, int[] indices)
    {
        char[] shuffle = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {

            shuffle[indices[i]] = word.charAt(i);
        }

        return new String(shuffle);

    }
}

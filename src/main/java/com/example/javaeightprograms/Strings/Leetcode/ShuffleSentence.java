package com.example.javaeightprograms.Strings.Leetcode;

public class ShuffleSentence {


        public static String reconstructSentence(String s) {
            // Split the input string into words
            String[] words = s.split(" ");
            // Array to hold the words in their correct positions
            String[] result = new String[words.length];

            // Iterate through each word
            for (String word : words) {
                // Find the position of the numeric character in the word
                int len = word.length();
                int position = word.charAt(len - 1) - '0'; // Convert character to integer
                // Place the word in the correct position in the result array
                result[position - 1] = word.substring(0, len - 1);
            }

            // Join the words in the result array into a single string
            return String.join(" ", result);
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(reconstructSentence("is2 sentence4 This1 a3")); // Output: "This is a sentence"
            System.out.println(reconstructSentence("Myself2 Me1 I4 and3"));    // Output: "Me Myself and I"
        }
}



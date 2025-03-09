package com.example.javaeightprograms.Interview;

public class MiddleSpaceTrim {

        public static void main(String[] args) {
            String sentence = "Today is a Good day";

            String result = removeMiddleSpace(sentence);
            System.out.println("Original sentence: " + sentence);
            System.out.println("Sentence with middle space removed: " + result);
        }

        public static String removeMiddleSpace(String sentence) {
            StringBuilder sb = new StringBuilder();

            String[] words = sentence.split(" ");
            int middleIndex = words.length / 2;

            for (int i = 0; i < words.length; i++) {
                if (i == middleIndex) {
                    continue; // Skip the middle space
                }
                sb.append(words[i]);
                if (i < words.length - 1) {
                    sb.append(" "); // Add space between words
                }
            }

            return sb.toString();
        }
    }



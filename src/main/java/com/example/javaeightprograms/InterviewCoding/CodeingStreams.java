package com.example.javaeightprograms.InterviewCoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodeingStreams {
    public static void main(String[] args) {

        String word =  "Akshay Chaganthi";

        List<String> duplicateString =  findDuplicateCharacter(word);


        System.out.println("Duplicate/Repeated characters in a given string: "+ duplicateString);

        System.out.println("Duplicate/Repeated characters and numbers of occurance in a given string: "+ findDuplicateCharacterAndOccurance(word));
    }

    static List<String> findDuplicateCharacter(String word) {

        return Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(character -> character,
                        Collectors.counting()))
                .entrySet().stream()
                .filter(eachchar-> eachchar.getValue()>1).map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    static Map<String, Long> findDuplicateCharacterAndOccurance(String word){

        return Arrays.stream(word.split(""))
                .collect(Collectors.groupingBy(character->character,
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(value-> value.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry:: getValue));

    }
}

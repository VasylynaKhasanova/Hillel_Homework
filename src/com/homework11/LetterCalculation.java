package com.homework11;

import java.util.*;

public class LetterCalculation {


    public static void main(String[] args) {
        String sentence = Arrays.toString(args);
        Set<Character> delimiters = new HashSet<>(Arrays.asList(' ', '.', ',', ':', ';', '?', '!', '-', '(', ')', '[', ']'));

        List<Character> letters = new ArrayList<>();

        for (int i = 0; i < sentence.length(); i++) {
            if (!delimiters.contains(sentence.charAt(i))) {
                letters.add(sentence.charAt(i));
            }
        }

        Set<Character> characters = new HashSet<>(letters);
        for (Character character : characters) {
            System.out.println(character + ": " + Collections.frequency(letters, character));
        }
    }

}


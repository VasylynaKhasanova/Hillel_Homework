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

        Set<Character> calculatedLetters = new HashSet<>();
        for (int i = 0; i < letters.size(); i++) {
            Character letter = letters.get(i);
            int letterCount = 0;
            if (calculatedLetters.contains(letter)) {
                continue;
            }
            for (Character character : letters) {
                if (character.equals(letter)) {
                    letterCount++;
                }
            }
            calculatedLetters.add(letter);
            System.out.println("Letter " + letter + " = " + letterCount);
        }
    }
}


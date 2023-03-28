package com.homework3;

import java.util.Scanner;

public class NumberInfo {

    public static void main(String[] args) {

        int number = getNumber();

        defineNumberSign(number);
        defineNumberParity(number);
        checkNumberValue(number);
        defineNumberComplexity(number);
    }

    private static int getNumber() {
        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    private static void checkNumberValue(int number) {
        if (number == 0) {
            System.out.println("Your number is 0.");
        }
    }

    private static void defineNumberComplexity(int number) {
        if (number > 0 & number != 1) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    System.out.println("Your number is composite.");
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Your number is prime.");
            }
        }
    }

    private static void defineNumberParity(int number) {
        if (number != 0 & number % 2 == 0) {
            System.out.println("Your number is even.");
        } else if (number != 0 & number % 2 != 0) {
            System.out.println("Your number is ood.");
        }
    }

    private static void defineNumberSign(int number) {
        if (number > 0) {
            System.out.println("Your number is positive.");
        } else if (number < 0) {
            System.out.println("Your number is negative.");
        }
    }
}
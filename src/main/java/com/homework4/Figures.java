package com.homework4;

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {

        int figure;
        String answer = "YES";

        while (answer.equals("YES")) {
            figure = selectOption();

            int width = 0;
            int high;

            if (figure == 1) {
                width = getWidth();
                high = getHigh();
            } else {
                high = getHigh();
            }

            if (figure == 1) {
                drawRectangle(width, high);
            } else if (figure == 2) {
                drawRightTriangle(high);
            } else if (figure == 3) {
                drawInvertedRightTriangle(high);
            } else {
                drawTriangle(high);
            }

            System.out.println("Do you want to proceed?");
            System.out.println("If YES -> enter YES");
            System.out.println("If NO -> enter NO");

            Scanner scanAnswer = new Scanner(System.in);
            answer = scanAnswer.next();

            if (answer.equals("NO")) {
                System.out.println("Good bye!");
            }
        }
    }

    private static int getHigh() {
        int high;
        System.out.println("Please, enter high of your figure:");
        Scanner scanHigh = new Scanner(System.in);
        high = scanHigh.nextInt();
        return high;
    }

    private static int getWidth() {
        System.out.println("Please, enter width of your figure:");
        Scanner scanWidth = new Scanner(System.in);
        return scanWidth.nextInt();
    }

    private static void drawTriangle(int high) {
        for (int i = 1; i <= high; i++) {
            for (int j = 0; j < high - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawInvertedRightTriangle(int high) {
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= high - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int high) {
        for (int i = 0; i < high; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void drawRectangle(int width, int high) {
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static int selectOption() {
        int figure;
        do {
            showMenuOptions();

            Scanner scanFigure = new Scanner(System.in);
            figure = scanFigure.nextInt();

        } while ((figure < 1) || (figure > 4));
        return figure;
    }

    private static void showMenuOptions() {
        System.out.println("Please, enter number of figure you want to draw: ");
        System.out.println("1. Rectangle.");
        System.out.println("2. Right triangle.");
        System.out.println("3. Inverted right triangle.");
        System.out.println("4. Triangle");
    }
}
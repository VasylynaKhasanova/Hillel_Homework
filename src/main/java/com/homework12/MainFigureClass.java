package com.homework12;

import com.homework12.circle.Circle;
import com.homework12.quadrangle.*;
import com.homework12.triangle.EquilateralTriangle;
import com.homework12.triangle.IsoscelesTriangle;
import com.homework12.triangle.RightTriangle;

import java.util.ArrayList;;
import java.util.Scanner;

public class MainFigureClass {
    public static void main(String[] args) {
        ArrayList<Figure> figureList = new ArrayList<>();

        int figureNumber;
        String answer = "YES";

        while (answer.equals("YES")) {
            figureNumber = getOption();

            double radius = 0;
            double firstWidth = 0;
            double secondWidth = 0;
            double firstLength = 0;
            double secondLength = 0;
            double firstDiagonal = 0;
            double secondDiagonal = 0;
            double firstSide = 0;
            double secondSide = 0;
            double thirdSide = 0;
            double high = 0;
            double angleBetweenDiagonals = 0;

            if (figureNumber == 1) {
                radius = getRadius();
            } else if (figureNumber == 2 | figureNumber == 4) {
                firstWidth = getFirstWidth();
                secondWidth = getSecondWidth();
                firstLength = getFirstLength();
                secondLength = getSecondLength();
            } else if (figureNumber == 3) {
                firstWidth = getFirstWidth();
                secondWidth = getSecondWidth();
                firstLength = getFirstLength();
                secondLength = getSecondLength();
                firstDiagonal = getFirstDiagonal();
                secondDiagonal = getSecondDiagonal();
            } else if (figureNumber == 5) {
                firstWidth = getFirstWidth();
                secondWidth = getSecondWidth();
                firstLength = getFirstLength();
                secondLength = getSecondLength();
                firstDiagonal = getFirstDiagonal();
                secondDiagonal = getSecondDiagonal();
                angleBetweenDiagonals = getAngleBetweenDiagonals();
            } else if (figureNumber == 6) {
                firstWidth = getFirstWidth();
                secondWidth = getSecondWidth();
                firstLength = getFirstLength();
                secondLength = getSecondLength();
                high = getHigh();
            } else {
                firstSide = getFirstSide();
                secondSide = getSecondSide();
                thirdSide = getThirdSide();

            }

            Figure figure = switch (figureNumber) {
                case 1 -> new Circle(radius);
                case 2 -> new Rectangle(firstWidth, secondWidth, firstLength, secondLength);
                case 3 -> new Rhombus(firstWidth, secondWidth, firstLength, secondLength, firstDiagonal, secondDiagonal);
                case 4 -> new Square(firstWidth, secondWidth, firstLength, secondLength);
                case 5 -> new Parallelogram(firstWidth, secondWidth, firstLength, secondLength, firstDiagonal,
                        secondDiagonal, angleBetweenDiagonals);
                case 6 -> new Trapeze(firstWidth, secondWidth, firstLength, secondLength, high);
                case 7 -> new RightTriangle(firstSide, secondSide, thirdSide);
                case 8 -> new EquilateralTriangle(firstSide, secondSide, thirdSide);
                case 9 -> new IsoscelesTriangle(firstSide, secondSide, thirdSide);
                default -> null;
            };

            figureList.add(figure);

            System.out.println("Do you want to proceed?");
            System.out.println("If YES -> enter YES");
            System.out.println("If NO -> enter NO");

            Scanner scanAnswer = new Scanner(System.in);
            answer = scanAnswer.next();

            if (answer.equals("NO")) {
                boolean replaceFlag;
                do {
                    replaceFlag = false;
                    for (int i = 0; i < figureList.size(); i++) {
                        if (i == figureList.size() - 1) {
                            continue;
                        }
                        Figure first = figureList.get(i);
                        Figure second = figureList.get(i + 1);

                        if (first.square() < second.square()) {
                            figureList.set(i, second);
                            figureList.set(i + 1, first);
                            replaceFlag = true;
                        } else if ((first.square() == second.square()) && first.perimeter() < second.perimeter()) {
                            figureList.set(i, second);
                            figureList.set(i + 1, first);
                            replaceFlag = true;
                        }
                    }
                } while (replaceFlag);

                System.out.println("======================Figure List======================");
                for (Figure sortedFigure : figureList) {
                    System.out.println(sortedFigure.getClass().getSimpleName() + ": Square: " + (float) sortedFigure.square()
                            + " | Perimeter: " + sortedFigure.perimeter());
                }
            }

        }
    }

    private static void showMenuOptions() {
        System.out.println("Please, enter number of figure you want to add: ");
        System.out.println("1. Circle.");
        System.out.println("2. Rectangle.");
        System.out.println("3. Rhombus.");
        System.out.println("4. Square");
        System.out.println("5. Parallelogram.");
        System.out.println("6. Trapeze.");
        System.out.println("7. Right triangle.");
        System.out.println("8. Equilateral triangle.");
        System.out.println("9. Isosceles triangle");
    }


    private static int getOption() {
        int figureNumber;
        do {
            showMenuOptions();

            Scanner scanNumber = new Scanner(System.in);
            figureNumber = scanNumber.nextInt();

        } while ((figureNumber < 1) || (figureNumber > 9));

        return figureNumber;
    }

    private static double getRadius() {
        double radius;
        System.out.println("Please, enter radius of your circle:");
        Scanner scanRadius = new Scanner(System.in);
        radius = scanRadius.nextInt();
        return radius;
    }

    private static double getFirstWidth() {
        double firstWidth;
        System.out.println("Please, enter first width of your figure:");
        Scanner scanWidth = new Scanner(System.in);
        firstWidth = scanWidth.nextInt();
        return firstWidth;

    }

    private static double getSecondWidth() {
        double secondWidth;
        System.out.println("Please, enter second width of your figure:");
        Scanner scanWidth = new Scanner(System.in);
        secondWidth = scanWidth.nextInt();
        return secondWidth;

    }

    private static double getFirstLength() {
        double firstLength;
        System.out.println("Please, enter first length of your figure:");
        Scanner scanLength = new Scanner(System.in);
        firstLength = scanLength.nextInt();
        return firstLength;
    }

    private static double getSecondLength() {
        double secondLength;
        System.out.println("Please, enter second length of your figure:");
        Scanner scanLength = new Scanner(System.in);
        secondLength = scanLength.nextInt();
        return secondLength;
    }

    private static double getFirstDiagonal() {
        double firstDiagonal;
        System.out.println("Please, enter first diagonal of your figure:");
        Scanner scanDiagonal = new Scanner(System.in);
        firstDiagonal = scanDiagonal.nextInt();
        return firstDiagonal;
    }

    private static double getSecondDiagonal() {
        double secondDiagonal;
        System.out.println("Please, enter second diagonal of your figure:");
        Scanner scanDiagonal = new Scanner(System.in);
        secondDiagonal = scanDiagonal.nextInt();
        return secondDiagonal;
    }

    private static double getFirstSide() {
        double firstSide;
        System.out.println("Please, enter first side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        firstSide = scanSide.nextInt();
        return firstSide;
    }

    private static double getSecondSide() {
        double secondSide;
        System.out.println("Please, enter second side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        secondSide = scanSide.nextInt();
        return secondSide;
    }

    private static double getThirdSide() {
        double thirdSide;
        System.out.println("Please, enter third side of your figure:");
        Scanner scanSide = new Scanner(System.in);
        thirdSide = scanSide.nextInt();
        return thirdSide;
    }

    private static double getHigh() {
        double high;
        System.out.println("Please, enter high of your figure:");
        Scanner scanHigh = new Scanner(System.in);
        high = scanHigh.nextInt();
        return high;
    }

    private static double getAngleBetweenDiagonals() {
        double angleBetweenDiagonals;
        System.out.println("Please, enter angle between diagonals of your figure:");
        Scanner scanAngle = new Scanner(System.in);
        angleBetweenDiagonals = scanAngle.nextInt();
        return angleBetweenDiagonals;
    }
}




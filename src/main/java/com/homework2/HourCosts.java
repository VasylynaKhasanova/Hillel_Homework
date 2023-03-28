package com.homework2;

import java.util.Scanner;

public class HourCosts {

    public static void main(String[] args) {
        int hours = getHours();
        int salary = getSalary();
        int tax = getTax();

        int yearHours = hours * 48; // 48 - number of weeks in the year
        int daySalary = salary / yearHours;
        int daySalaryTax = (daySalary * tax) / 100;
        int daySalaryTaxFree = daySalary - daySalaryTax;

        System.out.println("At " + hours + " working hours per week with an annual salary of " + salary +
                " and tax of " + tax + "% an hour of time costs " + daySalaryTaxFree + ".");

    }

    private static int getTax() {
        System.out.print("Please, enter the tax percentage ");
        Scanner scan3 = new Scanner(System.in);
        return scan3.nextInt();
    }

    private static int getSalary() {
        System.out.print("Please, enter the annual salary with taxes ");
        Scanner scan2 = new Scanner(System.in);
        return scan2.nextInt();
    }

    private static int getHours() {
        System.out.print("Please, enter working hours per week ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
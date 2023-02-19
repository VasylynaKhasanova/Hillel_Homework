//package com.homework3;
//
//import java.util.Scanner;
//
//public class SalaryCount {
//
//    public static void main(String[] args) {
//        int month = getMonth();
//        int cost = getCost();
//        int tax = getTax();
//        int days = getDays(month);
//
//        int workingDays = days - 8; // 8 - number of day offs during month;
//
//        int workingHours = workingDays * 8; // 8 - number of working hours per day;
//        int salaryGross = workingHours * cost;
//        int salaryTax = salaryGross * tax / 100;
//        int salaryNet = salaryGross - salaryTax;
//
//        System.out.println("Your gross salary: " + salaryGross);
//        System.out.println("Your net salary: " + salaryNet);
//    }
//
//    private static int getDays(int month) {
//        int days;
//        if ((month == 4) || (month == 6) || (month == 9) || (month == 11)) {
//            days = 30;
//        } else if (month == 2) {
//            days = 28;
//        } else {
//            days = 31;
//        }
//        return days;
//    }
//
//    private static int getTax() {
//        System.out.println("Please, enter percentage of tax: ");
//        Scanner scanTax = new Scanner(System.in);
//        return scanTax.nextInt();
//    }
//
//    private static int getCost() {
//        System.out.println("Please, enter cost of one working hour: ");
//        Scanner scanCost = new Scanner(System.in);
//        return scanCost.nextInt();
//    }
//
//    private static int getMonth() {
//        int month;
//
//        do {
//            System.out.println("Please, enter the month number from 1 to 12: ");
//            Scanner scan = new Scanner(System.in);
//            month = scan.nextInt();
//        } while ((month <= 0) || (month > 12));
//        return month;
//    }
//}

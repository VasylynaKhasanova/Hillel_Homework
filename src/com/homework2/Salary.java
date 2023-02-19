//package com.homework2;
//
//public class Salary {
//
//    public static void main(String[] args) {
//        int workingHours =Integer.parseInt(args[0]);
//        int hourCost =Integer.parseInt(args[1]);
//        int taxPercentage =Integer.parseInt(args[2]);
//
//        int monthGross = (workingHours * 4) * hourCost; // 4 - number of weeks in the month
//        int monthTax = (monthGross * taxPercentage) / 100;
//        int monthNet = monthGross - monthTax;
//
//        int yearGross = monthGross * 12; // 12 - number of months in the year
//        int yearNet = monthNet * 12; // 12 - number of months in the year
//
//        System.out.println ("Month net salary: " + monthNet);
//        System.out.println ("Month gross salary: " + monthGross);
//        System.out.println ("Year net salary: " + yearNet);
//        System.out.println ("Year gross salary: " + yearGross);
//
//    }
//}

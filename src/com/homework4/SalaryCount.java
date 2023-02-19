//package com.homework4;
//
//public class SalaryCount {
//
//    public static void main(String[] args) {
//
//        int hourCost = Integer.parseInt(args[0]);
//        double percentage = (double) Integer.parseInt(args[1]) / 100;
//
//        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//        int[] daysInMonth = new int[12];
//        String[] monthsName = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//
//        calculateTotalWorkingDaysInEachMonth(months, daysInMonth);
//        calculateSalary(hourCost, percentage, months, daysInMonth, monthsName);
//    }
//
//    private static void calculateSalary(int hourCost, double percentage, int[] months, int[] daysInMonth, String[] monthsName) {
//        double salaryGross;
//        int workingHoursPerMonth;
//        double salaryNet;
//        double salaryGrossPerYear = 0;
//        double salaryNetPerYear = 0;
//        for (int i = 0; i < months.length; i++) {
//
//            workingHoursPerMonth = daysInMonth[i] * 8;
//            salaryGross = workingHoursPerMonth * hourCost;
//            salaryNet = salaryGross - (salaryGross * percentage);
//            System.out.println(monthsName[i] + " " + salaryGross + " " + salaryNet);
//
//            salaryGrossPerYear += salaryGross;
//            salaryNetPerYear += salaryNet;
//        }
//        System.out.println("Year gross salary: " + salaryGrossPerYear);
//        System.out.println("Year net salary: " + salaryNetPerYear);
//    }
//
//    private static void calculateTotalWorkingDaysInEachMonth(int[] months, int[] daysInMonth) {
//        int totalWorkDaysInMonth;
//        int weekDayCounter = 0;
//        int holidays = 0;
//        for (int i = 0; i < months.length; i++) {
//            int days = months[i];
//            totalWorkDaysInMonth = 0;
//            for (int k = 1; k <= days; k++) {
//                if (holidays != 0) {
//                    holidays--;
//                    continue;
//                }
//                weekDayCounter++;
//                if (weekDayCounter == 5) {
//                    holidays += 2;
//                    weekDayCounter = 0;
//                }
//                totalWorkDaysInMonth++;
//            }
//            daysInMonth[i] = totalWorkDaysInMonth;
//        }
//    }
//}
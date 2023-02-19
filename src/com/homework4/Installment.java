//package com.homework4;
//
//import java.util.Scanner;
//
//public class Installment {
//    public static void main(String[] args) {
//
//        System.out.println("Please, enter amount of your credit:");
//        Scanner scan = new Scanner(System.in);
//        int creditAmount = scan.nextInt();
//
//        System.out.println("Please, enter percentage on the loan balance:");
//        Scanner scanPercent = new Scanner(System.in);
//        float creditPercent = scanPercent.nextFloat() / 100;
//
//        System.out.println("Please, select one option to proceed:");
//        System.out.println("Enter 1 if you want to calculate number of monthly payments to repay the loan.");
//        System.out.println("Enter 2 if you want to calculate the amount of the monthly payment.");
//
//        Scanner scanOption = new Scanner(System.in);
//        int option = scanOption.nextInt();
//
//        if (option == 1) {
//            calculateMonthlyPaymentsQuantity(creditAmount, creditPercent);
//        } else {
//            calculateMonthlyPaymentAmount(creditAmount, creditPercent);
//        }
//    }
//
//    private static void calculateMonthlyPaymentAmount(int creditAmount, float creditPercent) {
//        System.out.println("Please, enter number of payments:");
//        Scanner scanPay = new Scanner(System.in);
//        int payNumber = scanPay.nextInt();
//
//        double monthlyPayment = creditAmount * ((creditPercent * Math.pow((1 + creditPercent), payNumber)) /
//                (Math.pow((1 + creditPercent), payNumber) - 1));
//        System.out.println(monthlyPayment);
//    }
//
//    private static void calculateMonthlyPaymentsQuantity(int creditAmount, float creditPercent) {
//        System.out.println("Please, enter amount of monthly payment:");
//        Scanner scanAmount = new Scanner(System.in);
//        int amountMonthPayment = scanAmount.nextInt();
//
//        float creditBalance = creditAmount - amountMonthPayment;
//        int number = 1;
//
//        while (creditBalance > 0) {
//            float creditBalanceNew;
//
//            creditBalanceNew = creditBalance + ((creditBalance * creditPercent));
//            creditBalance = creditBalanceNew - amountMonthPayment;
//
//            number++;
//        }
//        System.out.println("You need " + number + " payments to repay the loan.");
//    }
//}

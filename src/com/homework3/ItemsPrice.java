//package com.homework3;
//
//import java.util.Scanner;
//
//public class ItemsPrice {
//
//    public static void main(String[] args) {
//        int price = Integer.parseInt(args[0]);
//
//        System.out.println("What amount of items you want to buy?");
//        Scanner scan = new Scanner(System.in);
//        int amount = scan.nextInt();
//
//        double itemsCost = price * amount;
//        double discount = getDiscount(amount, itemsCost);
//
//        itemsCost = itemsCost - discount;
//        System.out.println("Price: " + (float) itemsCost);
//    }
//
//    private static double getDiscount(int amount, double itemsCost) {
//        double discount = 0;
//        if (amount > 10 & amount <= 20) {
//            discount = itemsCost * 0.05;
//        } else if (amount > 20 & amount <= 30) {
//            discount = itemsCost * 0.01;
//        } else if (amount > 30 & amount <= 40) {
//            discount = itemsCost * 0.12;
//        } else if (amount > 40 & amount <= 50) {
//            discount = itemsCost * 0.124;
//        } else if (amount > 50 & amount <= 60) {
//            discount = itemsCost * 0.128;
//        } else if (amount > 60 & amount <= 70) {
//            discount = itemsCost * 0.132;
//        } else if (amount > 70 & amount <= 80) {
//            discount = itemsCost * 0.136;
//        } else if (amount > 80) {
//            discount = itemsCost * 0.13;
//        }
//        return discount;
//    }
//}

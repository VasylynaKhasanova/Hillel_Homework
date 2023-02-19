//package com.homework4;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class SortingArray {
//    public static void main(String[] args) {
//
//        System.out.println("Please, enter size of your array:");
//        Scanner scan = new Scanner(System.in);
//
//        int size = scan.nextInt();
//        int[] array = new int[size];
//
//        enterAndSortArr(array);
//        sortArrMin(array);
//        sortArrMax(array);
//        sortArrInner(array);
//
//    }
//
//    public static void enterAndSortArr(int[] arr) {
//
//        Scanner scanArr = new Scanner(System.in);
//        int i = 0;
//
//        for (int element : arr) {
//            System.out.println("Enter " + (i + 1) + " array element:");
//            arr[i] = scanArr.nextInt();
//            i++;
//        }
//
//        System.out.println("Base: " + Arrays.toString(arr));
//    }
//
//    public static void sortArrMin(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            int index = i;
//            int min = arr[i];
//
//            for (int j = i + 1; j < arr.length; j++) {
//
//                if (arr[j] < min) {
//                    index = j;
//                    min = arr[j];
//                }
//            }
//            arr[index] = arr[i];
//            arr[i] = min;
//        }
//        System.out.println("ASC: " + Arrays.toString(arr));
//    }
//
//    public static void sortArrMax(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            int index = i;
//            int max = arr[i];
//
//            for (int j = i + 1; j < arr.length; j++) {
//
//                if (arr[j] > max) {
//                    index = j;
//                    max = arr[j];
//                }
//            }
//            arr[index] = arr[i];
//            arr[i] = max;
//        }
//        System.out.println("DESC: " + Arrays.toString(arr));
//    }
//
//    public static void sortArrInner(int[] arr) {
//
//        int i = 0;
//        int j = arr.length - 1;
//        int max = 0;
//        int a;
//        int x = 0;
//        int temp;
//
//        while (i < j) {
//
//            for (a = i; a <= j; a++) {
//
//                if (arr[a] > arr[max]) {
//                    max = a;
//                }
//            }
//
//            if (x % 2 == 0) {
//                temp = arr[i];
//                arr[i] = arr[max];
//                arr[max] = temp;
//
//                i++;
//
//                max = i;
//            } else {
//                temp = arr[j];
//                arr[j] = arr[max];
//                arr[max] = temp;
//
//                j--;
//
//                max = j;
//            }
//            x++;
//        }
//        System.out.println("Inner: " + Arrays.toString(arr));
//    }
//
//}
//
//

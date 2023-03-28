package com.homework10;

import com.homework10.foodProducts.bakeryProducts.Bread;
import com.homework10.foodProducts.bakeryProducts.Croissant;
import com.homework10.foodProducts.bakeryProducts.Pita;
import com.homework10.foodProducts.diaryProducts.Cheese;
import com.homework10.foodProducts.diaryProducts.Milk;
import com.homework10.foodProducts.diaryProducts.Yogurt;
import com.homework10.foodProducts.сereals.Buckwheat;
import com.homework10.foodProducts.сereals.Oatmeal;
import com.homework10.foodProducts.сereals.Rice;
import com.homework10.nonFoodProducts.decor.Candle;
import com.homework10.nonFoodProducts.decor.Painting;
import com.homework10.nonFoodProducts.decor.Vase;
import com.homework10.nonFoodProducts.householdAppliance.Microwave;
import com.homework10.nonFoodProducts.householdAppliance.Refrigerator;
import com.homework10.nonFoodProducts.householdAppliance.WashingMachine;
import com.homework10.nonFoodProducts.officeItems.Pen;
import com.homework10.nonFoodProducts.officeItems.Pencil;
import com.homework10.nonFoodProducts.officeItems.Stapler;

import java.time.LocalDateTime;

public class ProductFactory {
    public static int foodProductsCount = 0;
    public static int nonFoodProductsCount = 0;

    public static Bread getBread(String type, String productName, String trademark, LocalDateTime productionDate,
                                 LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Bread(type, productName, trademark, productionDate, expirationDate);
    }

    public static Croissant getCroissant(String type, String productName, String trademark, LocalDateTime productionDate,
                                         LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Croissant(type, productName, trademark, productionDate, expirationDate);
    }

    public static Pita getPita(String type, String productName, String trademark, LocalDateTime productionDate,
                               LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Pita(type, productName, trademark, productionDate, expirationDate);
    }

    public static Cheese getCheese(String type, String productName, String trademark, LocalDateTime productionDate,
                                   LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Cheese(type, productName, trademark, productionDate, expirationDate);
    }

    public static Milk getMilk(String type, String productName, String trademark, LocalDateTime productionDate,
                               LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Milk(type, productName, trademark, productionDate, expirationDate);
    }

    public static Yogurt getYogurt(String type, String productName, String trademark, LocalDateTime productionDate,
                                   LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Yogurt(type, productName, trademark, productionDate, expirationDate);
    }

    public static Buckwheat getBuckwheat(String type, String productName, String trademark, LocalDateTime productionDate,
                                         LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Buckwheat(type, productName, trademark, productionDate, expirationDate);
    }

    public static Oatmeal getOatmeal(String type, String productName, String trademark, LocalDateTime productionDate,
                                     LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Oatmeal(type, productName, trademark, productionDate, expirationDate);
    }

    public static Rice getRice(String type, String productName, String trademark, LocalDateTime productionDate,
                               LocalDateTime expirationDate) {
        foodProductsCount++;
        return new Rice(type, productName, trademark, productionDate, expirationDate);
    }

    public static Candle getCandle(String type, String productName, String trademark, LocalDateTime productionDate,
                                   LocalDateTime expirationDate) {
        nonFoodProductsCount++;
        return new Candle(type, productName, trademark, productionDate, expirationDate);
    }

    public static Painting getPainting(String type, String productName, String trademark, LocalDateTime productionDate,
                                       LocalDateTime expirationDate) {
        nonFoodProductsCount++;
        return new Painting(type, productName, trademark, productionDate, expirationDate);
    }

    public static Vase getVase(String type, String productName, String trademark, LocalDateTime productionDate,
                               LocalDateTime expirationDate) {
        nonFoodProductsCount++;
        return new Vase(type, productName, trademark, productionDate, expirationDate);
    }

    public static Pen getPen(String type, String productName, String trademark, LocalDateTime productionDate,
                             LocalDateTime expirationDate) {
        nonFoodProductsCount++;
        return new Pen(type, productName, trademark, productionDate, expirationDate);
    }

    public static Pencil getPencil(String type, String productName, String trademark, LocalDateTime productionDate,
                                   LocalDateTime expirationDate) {
        nonFoodProductsCount++;
        return new Pencil(type, productName, trademark, productionDate, expirationDate);
    }

    public static Stapler getStapler(String type, String productName, String trademark, LocalDateTime productionDate,
                                     LocalDateTime expirationDate) {
        nonFoodProductsCount++;
        return new Stapler(type, productName, trademark, productionDate, expirationDate);
    }

    public static Microwave getMicrowave(String type, String productName, String trademark, LocalDateTime productionDate,
                                         int warrantyMonths) {
        nonFoodProductsCount++;
        return new Microwave(type, productName, trademark, productionDate, warrantyMonths);
    }

    public static Refrigerator getRefrigerator(String type, String productName, String trademark, LocalDateTime productionDate,
                                               int warrantyMonths) {
        nonFoodProductsCount++;
        return new Refrigerator(type, productName, trademark, productionDate, warrantyMonths);
    }

    public static WashingMachine getWashingMachine(String type, String productName, String trademark, LocalDateTime productionDate,
                                                   int warrantyMonths) {
        nonFoodProductsCount++;
        return new WashingMachine(type, productName, trademark, productionDate, warrantyMonths);
    }
}
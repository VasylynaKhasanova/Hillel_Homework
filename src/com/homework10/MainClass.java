package com.homework10;

import com.homework10.foodProducts.FoodProducts;
import com.homework10.foodProducts.bakeryProducts.BakeryProducts;
import com.homework10.foodProducts.bakeryProducts.Bread;
import com.homework10.foodProducts.bakeryProducts.Croissant;
import com.homework10.foodProducts.bakeryProducts.Pita;
import com.homework10.foodProducts.diaryProducts.Cheese;
import com.homework10.foodProducts.diaryProducts.DiaryProducts;
import com.homework10.foodProducts.diaryProducts.Milk;
import com.homework10.foodProducts.diaryProducts.Yogurt;
import com.homework10.foodProducts.сereals.Buckwheat;
import com.homework10.foodProducts.сereals.Cereals;
import com.homework10.foodProducts.сereals.Oatmeal;
import com.homework10.foodProducts.сereals.Rice;
import com.homework10.nonFoodProducts.NonFoodProducts;
import com.homework10.nonFoodProducts.decor.Candle;
import com.homework10.nonFoodProducts.decor.Decor;
import com.homework10.nonFoodProducts.decor.Painting;
import com.homework10.nonFoodProducts.decor.Vase;
import com.homework10.nonFoodProducts.householdAppliance.HouseholdAppliances;
import com.homework10.nonFoodProducts.householdAppliance.Microwave;
import com.homework10.nonFoodProducts.householdAppliance.Refrigerator;
import com.homework10.nonFoodProducts.householdAppliance.WashingMachine;
import com.homework10.nonFoodProducts.officeItems.OfficeItems;
import com.homework10.nonFoodProducts.officeItems.Pen;
import com.homework10.nonFoodProducts.officeItems.Pencil;
import com.homework10.nonFoodProducts.officeItems.Stapler;

import java.time.LocalDateTime;

public class MainClass {

    public static void main(String[] args) {

        Bread bread = ProductFactory.getBread("black", "Sandwich bread", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 59),
                LocalDateTime.of(2023, 4, 2, 23, 59));

        Bread bread1 = ProductFactory.getBread("white", "Sandwich bread", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 59),
                LocalDateTime.of(2023, 4, 2, 23, 59));

        Croissant croissant = ProductFactory.getCroissant("with jam", "Tasty Croissant", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Croissant croissant1 = ProductFactory.getCroissant("empty", "Tasty Croissant", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Pita pita = ProductFactory.getPita("tortilla", "Tortilla mexico", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Cheese cheese = ProductFactory.getCheese("parmesan", "Parmegano Italiano", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Cheese cheese1 = ProductFactory.getCheese("gouda", "Gouda cheese", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk = ProductFactory.getMilk("cow", "Mlekowita", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk1 = ProductFactory.getMilk("almond", "Almond paradise", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk2 = ProductFactory.getMilk("almond", "Almond paradise", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Yogurt yogurt = ProductFactory.getYogurt("greek", "Natural", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Buckwheat buckwheat = ProductFactory.getBuckwheat("green", "Buckwheat taste", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Oatmeal oatmeal = ProductFactory.getOatmeal("quick cooking", "Oatmeal breakfast", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Rice rice = ProductFactory.getRice("white", "Rice", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Rice rice1 = ProductFactory.getRice("black", "Rice", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Rice rice2 = ProductFactory.getRice("brown", "Rice", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Candle candle = ProductFactory.getCandle("aromatic", "Flower aroma", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2038, 4, 2, 23, 0));

        Painting painting = ProductFactory.getPainting("printed", "Landscape pictures", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2088, 4, 2, 23, 0));

        Painting painting1 = ProductFactory.getPainting("acrylic", "Flower addiction", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2088, 4, 2, 23, 0));

        Vase vase = ProductFactory.getVase("glass", "Glass vase for you", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2088, 4, 2, 23, 0));

        Pen pen = ProductFactory.getPen("gel", "Pen&Pencil", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Pencil pencil = ProductFactory.getPencil("H1", "Pen&Pencil", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Pencil pencil1 = ProductFactory.getPencil("B3", "Pen&Pencil", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Stapler stapler = ProductFactory.getStapler("iron", "Iron men", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Microwave microwave = ProductFactory.getMicrowave("with grill", "Microwave World", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Microwave microwave1 = ProductFactory.getMicrowave("with grill and convection", "Microwave World", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Refrigerator refrigerator = ProductFactory.getRefrigerator("compression", "Refrigerator World", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Refrigerator refrigerator1 = ProductFactory.getRefrigerator("thermoelectric", "Refrigerator World", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Refrigerator refrigerator2 = ProductFactory.getRefrigerator("with vortex coolers", "Refrigerator World", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        WashingMachine washingMachine = ProductFactory.getWashingMachine("with drying", "Washing World", "Factory Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Bread bread2 = new Bread("black", "Sandwich bread", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 59),
                LocalDateTime.of(2023, 4, 2, 23, 59));

        Bread bread3 = new Bread("white", "Sandwich bread", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 59),
                LocalDateTime.of(2023, 4, 2, 23, 59));

        Croissant croissant2 = new Croissant("with jam", "Tasty Croissant", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Croissant croissant3 = new Croissant("empty", "Tasty Croissant", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Croissant croissant4 = new Croissant("with double jam", "Tasty Croissant", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Pita pita1 = new Pita("armenian", "Tortilla mexico", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Pita pita2 = new Pita("tortilla", "Tortilla mexico", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Cheese cheese2 = new Cheese("parmesan", "Parmegano Italiano", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Cheese cheese3 = new Cheese("gouda", "Gouda cheese", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk3 = new Milk("cow", "Mlekowita", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk4 = new Milk("almond", "Almond paradise", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk5 = new Milk("almond", "Almond paradise", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Milk milk6 = new Milk("coconut", "Almond paradise", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Yogurt yogurt1 = new Yogurt("on sourdough", "Natural", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Yogurt yogurt2 = new Yogurt("with fruit", "Natural", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Yogurt yogurt3 = new Yogurt("greek", "Natural", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Buckwheat buckwheat1 = new Buckwheat("green", "Buckwheat taste", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Oatmeal oatmeal1 = new Oatmeal("quick cooking", "Oatmeal breakfast", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Rice rice3 = new Rice("white", "Rice", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Rice rice4 = new Rice("black", "Rice", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Rice rice5 = new Rice("brown", "Rice", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2023, 4, 2, 23, 0));

        Candle candle1 = new Candle("aromatic", "Flower aroma", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2038, 4, 2, 23, 0));

        Candle candle2 = new Candle("odorless", "Flower aroma", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2038, 4, 2, 23, 0));

        Candle candle3 = new Candle("with crackling", "Flower aroma", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2038, 4, 2, 23, 0));

        Painting painting2 = new Painting("printed", "Landscape pictures", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2088, 4, 2, 23, 0));

        Painting painting3 = new Painting("acrylic", "Flower addiction", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2088, 4, 2, 23, 0));

        Vase vase1 = new Vase("glass", "Glass vase for you", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2088, 4, 2, 23, 0));

        Pen pen1 = new Pen("gel", "Pen&Pencil", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Pencil pencil2 = new Pencil("H1", "Pen&Pencil", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Pencil pencil3 = new Pencil("B3", "Pen&Pencil", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Stapler stapler1 = new Stapler("iron", "Iron men", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0),
                LocalDateTime.of(2036, 4, 2, 23, 0));

        Microwave microwave2 = new Microwave("with grill", "Microwave World", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Microwave microwave3 = new Microwave("with grill and convection", "Microwave World", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Refrigerator refrigerator3 = new Refrigerator("compression", "Refrigerator World", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Refrigerator refrigerator4 = new Refrigerator("thermoelectric", "Refrigerator World", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        Refrigerator refrigerator5 = new Refrigerator("with vortex coolers", "Refrigerator World", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        WashingMachine washingMachine1 = new WashingMachine("with drying", "Washing World", "Food Production",
                LocalDateTime.of(2023, 3, 12, 23, 0), 24);

        System.out.println("The factory produced " + ProductFactory.foodProductsCount + " food products.");
        System.out.println("The factory produced " + ProductFactory.nonFoodProductsCount + " non-food products.");
        System.out.println("In general produced " + FoodProducts.countFoodProducts + " food products.");
        System.out.println("In general produced " + NonFoodProducts.countNonFoodProducts + " non-food products.");
        System.out.println("In general produced " + BakeryProducts.bakeryProductsCount + " bakery products.");
        System.out.println("In general produced " + DiaryProducts.diaryProductsCount + " diary products.");
        System.out.println("In general produced " + Cereals.cerealsCount + " cereals products.");
        System.out.println("In general produced " + Decor.decorCount + " decor products.");
        System.out.println("In general produced " + HouseholdAppliances.householdAppliancesCount + " household appliance products.");
        System.out.println("In general produced " + OfficeItems.officeItemsCount + " office items products.");
    }

}

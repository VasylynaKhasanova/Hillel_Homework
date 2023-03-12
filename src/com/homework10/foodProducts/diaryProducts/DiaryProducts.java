package com.homework10.foodProducts.diaryProducts;

import com.homework10.foodProducts.FoodProducts;

import java.time.LocalDateTime;

public abstract class DiaryProducts extends FoodProducts {
    public static int diaryProductsCount = 0;

    public DiaryProducts(String type, String productName, String trademark, LocalDateTime productionDate,
                         LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
        diaryProductsCount++;
    }
}

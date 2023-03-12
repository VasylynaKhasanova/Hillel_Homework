package com.homework10.foodProducts.bakeryProducts;

import com.homework10.foodProducts.FoodProducts;

import java.time.LocalDateTime;

public abstract class BakeryProducts extends FoodProducts {
    public BakeryProducts(String type, String productName, String trademark, LocalDateTime productionDate, LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

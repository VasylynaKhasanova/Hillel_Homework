package com.homework10.foodProducts.сereals;

import com.homework10.foodProducts.FoodProducts;

import java.time.LocalDateTime;

public abstract class Cereals extends FoodProducts {
    public Cereals(String type, String productName, String trademark, LocalDateTime productionDate,
                   LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}


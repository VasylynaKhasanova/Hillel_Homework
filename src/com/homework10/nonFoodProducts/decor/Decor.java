package com.homework10.nonFoodProducts.decor;

import com.homework10.nonFoodProducts.NonFoodProducts;

import java.time.LocalDateTime;

public abstract class Decor extends NonFoodProducts {
    private final LocalDateTime expirationDate;

    public Decor(String type, String productName, String trademark, LocalDateTime productionDate,
                 LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate);
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
}

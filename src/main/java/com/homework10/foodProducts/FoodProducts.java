package com.homework10.foodProducts;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class FoodProducts {
    private final String type;
    private final String productName;
    private final String trademark;
    private final LocalDateTime productionDate;
    private final LocalDateTime expirationDate;
    public static int countFoodProducts = 0;

    public FoodProducts(String type, String productName, String trademark, LocalDateTime productionDate,
                        LocalDateTime expirationDate) {
        this.type = type;
        this.productName = productName;
        this.trademark = trademark;
        this.expirationDate = expirationDate;
        this.productionDate = productionDate;
        countFoodProducts++;
    }

    public LocalDateTime getProductionDate() {
        return productionDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public String getType() {
        return type;
    }

    public String getProductName() {
        return productName;
    }

    public String getTrademark() {
        return trademark;
    }
}

package com.homework10.nonFoodProducts;

import java.time.LocalDateTime;

public abstract class NonFoodProducts {
    private final String type;
    private final String productName;
    private final String trademark;
    private final LocalDateTime productionDate;
    public static int countNonFoodProducts = 0;

    public NonFoodProducts(String type, String productName, String trademark, LocalDateTime productionDate) {
        this.type = type;
        this.productName = productName;
        this.trademark = trademark;
        this.productionDate = productionDate;
        countNonFoodProducts++;
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

    public LocalDateTime getProductionDate() {
        return productionDate;
    }
}


package com.homework10.nonFoodProducts.householdAppliance;

import com.homework10.nonFoodProducts.NonFoodProducts;

import java.time.LocalDateTime;

public abstract class HouseholdAppliances extends NonFoodProducts {
    private final int warrantyMonths;

    public HouseholdAppliances(String type, String productName, String trademark, LocalDateTime productionDate,
                               int warrantyMonths) {
        super(type, productName, trademark, productionDate);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }
}

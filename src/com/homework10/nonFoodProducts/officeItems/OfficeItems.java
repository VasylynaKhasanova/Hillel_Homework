package com.homework10.nonFoodProducts.officeItems;

import com.homework10.nonFoodProducts.NonFoodProducts;

import java.time.LocalDateTime;

public abstract class OfficeItems extends NonFoodProducts {
    private final LocalDateTime expirationDate;

    public OfficeItems(String type, String productName, String trademark, LocalDateTime productionDate,
                       LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate);
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }
}

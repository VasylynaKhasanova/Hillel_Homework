package com.homework10.nonFoodProducts.officeItems;

import java.time.LocalDateTime;

public class Stapler extends OfficeItems {
    public Stapler(String type, String productName, String trademark, LocalDateTime productionDate,
                   LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

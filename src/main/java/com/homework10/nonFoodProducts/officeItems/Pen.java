package com.homework10.nonFoodProducts.officeItems;

import java.time.LocalDateTime;

public class Pen extends OfficeItems{
    public Pen(String type, String productName, String trademark, LocalDateTime productionDate,
               LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

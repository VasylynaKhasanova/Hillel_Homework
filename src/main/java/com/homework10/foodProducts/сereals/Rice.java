package com.homework10.foodProducts.сereals;

import java.time.LocalDateTime;

public class Rice extends Cereals{
    public Rice(String type, String productName, String trademark, LocalDateTime productionDate,
                LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

package com.homework10.nonFoodProducts.decor;

import java.time.LocalDateTime;

public class Painting extends Decor{
    public Painting(String type, String productName, String trademark, LocalDateTime productionDate,
                    LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

package com.homework10.nonFoodProducts.decor;

import java.time.LocalDateTime;

public class Vase extends Decor{
    public Vase(String type, String productName, String trademark, LocalDateTime productionDate,
                LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

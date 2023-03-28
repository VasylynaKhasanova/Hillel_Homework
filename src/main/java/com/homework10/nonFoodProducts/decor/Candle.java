package com.homework10.nonFoodProducts.decor;

import java.time.LocalDateTime;

public class Candle extends Decor{
    public Candle(String type, String productName, String trademark, LocalDateTime productionDate,
                  LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

package com.homework10.foodProducts.bakeryProducts;

import java.time.LocalDateTime;

public class Pita extends BakeryProducts{
    public Pita(String type, String productName, String trademark, LocalDateTime productionDate,
                LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

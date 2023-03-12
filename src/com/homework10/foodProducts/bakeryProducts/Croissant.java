package com.homework10.foodProducts.bakeryProducts;

import java.time.LocalDateTime;

public class Croissant extends BakeryProducts {
    public Croissant(String type, String productName, String trademark, LocalDateTime productionDate,
                     LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

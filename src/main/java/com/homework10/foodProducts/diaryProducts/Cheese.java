package com.homework10.foodProducts.diaryProducts;

import java.time.LocalDateTime;

public class Cheese extends DiaryProducts{
    public Cheese(String type, String productName, String trademark, LocalDateTime productionDate,
                  LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

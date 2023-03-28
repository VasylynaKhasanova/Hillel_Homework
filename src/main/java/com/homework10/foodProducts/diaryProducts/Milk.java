package com.homework10.foodProducts.diaryProducts;

import java.time.LocalDateTime;

public class Milk extends DiaryProducts{
    public Milk(String type, String productName, String trademark, LocalDateTime productionDate,
                LocalDateTime expirationDate) {
        super(type, productName, trademark, productionDate, expirationDate);
    }
}

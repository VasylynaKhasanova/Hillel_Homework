package com.homework10.nonFoodProducts.householdAppliance;

import java.time.LocalDateTime;

public class Refrigerator extends HouseholdAppliances{

    public Refrigerator(String type, String productName, String trademark, LocalDateTime productionDate,
                        int warrantyMonths) {
        super(type, productName, trademark, productionDate, warrantyMonths);
    }
}

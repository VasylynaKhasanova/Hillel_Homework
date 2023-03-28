package com.homework10.nonFoodProducts.householdAppliance;

import java.time.LocalDateTime;

public class Microwave extends HouseholdAppliances{

    public Microwave(String type, String productName, String trademark, LocalDateTime productionDate, int warrantyMonths) {
        super(type, productName, trademark, productionDate, warrantyMonths);
    }
}

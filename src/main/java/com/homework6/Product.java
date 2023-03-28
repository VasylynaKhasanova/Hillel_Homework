package com.homework6;

public class Product {
    private String name;
    private int itemCode;
    private int price;
    private String description;
    private boolean isPresent;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public Product() {

    }

    public Product(String name, int itemCode, int price, String description, boolean isPresent) {
        this.name = name;
        this.itemCode = itemCode;
        this.price = price;
        this.description = description;
        this.isPresent = isPresent;
    }
}

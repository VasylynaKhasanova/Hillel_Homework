package com.homework9;

public enum Size {
    EXTRA_SMALL("XS", 30, 50), SMALL("S", 34,52), MEDIUM("M", 36, 54),
    LARGE("L", 38, 56), EXTRA_LARGE("XL", 40, 58),
    EXTRA_EXTRA_LARGE("XXL", 42,60);

    private final String shortName;
    private final int width;
    private final int length;

    Size(String shortName, int width, int length) {
        this.shortName = shortName;
        this.width = width;
        this.length = length;
    }

    public String getShortName() {
        return shortName;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString(){
        return shortName + " " + width + " " + length;
    }
}

package com.homework14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver getDriver() {
        String driverName = ConfigProvider.getDriverName();

        return switch (driverName) {
            case "chrome" -> WebDriverManager.chromiumdriver().create();
            case "firefox" -> WebDriverManager.firefoxdriver().create();
            default -> throw new IllegalArgumentException("Wrong browser type");
        };
    }
}

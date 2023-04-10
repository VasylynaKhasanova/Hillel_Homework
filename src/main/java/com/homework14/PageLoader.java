package com.homework14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageLoader {

    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get("https://ithillel.ua/");

        Page page = PageFactory.initElements(driver, Page.class);

        page.clickOnProgramCourse();
        page.clickOnFrontEndCourse();
        page.clickOnButton(driver);
        System.out.println(page.getTeachersNames());


    }
}


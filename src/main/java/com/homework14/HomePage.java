package com.homework14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"body\"]/div/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[1]")
    private WebElement programCourse;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnProgramCourse() {
        programCourse.click();
    }
}

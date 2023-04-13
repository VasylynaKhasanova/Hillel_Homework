package com.homework14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramingPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]/p[1]")
    private WebElement frontEndCourse;

    public void clickOnFrontEndCourse() {
        frontEndCourse.click();
    }

    public ProgramingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

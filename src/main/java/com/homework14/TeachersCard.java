package com.homework14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class TeachersCard {
    private WebDriver driver;

    @FindBy(css = "p.coach-card_name")
    private WebElement teacherCardName;

    public TeachersCard(WebDriver driver, WebElement card) {
        this.driver = driver;
        PageFactory.initElements(new DefaultElementLocatorFactory(card), this);
    }

    public String getTeacherCardName() {
        return teacherCardName.getText();
    }
}

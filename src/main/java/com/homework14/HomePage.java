package com.homework14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"body\"]/div/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[1]")
    private WebElement programCourse;

    public void clickOnProgramCourse() {
        programCourse.click();
    }
}

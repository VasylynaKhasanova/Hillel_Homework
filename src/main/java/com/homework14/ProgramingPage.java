package com.homework14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramingPage {

    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]/p[1]")
    private WebElement frontEndCourse;

    public void clickOnFrontEndCourse() {
        frontEndCourse.click();
    }
}

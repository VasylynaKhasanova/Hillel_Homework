package com.homework14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeachersCard {

    @FindBy(css = "p.coach-card_name")
    private WebElement teacherCardName;

    public String getTeacherCardName() {
        return teacherCardName.getText();
    }
}

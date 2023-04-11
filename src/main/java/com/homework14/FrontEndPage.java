package com.homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FrontEndPage {

    @FindBy(css = "a.coach-card")
    private List<WebElement> teachersCards;

    @FindBy(id = "coachesShowAllButton")
    private WebElement button;

    public void clickOnButton(WebDriver driver) {
        String script = "window.scrollBy(0, 2500);";
        ((JavascriptExecutor) driver).executeScript(script);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("coachesShowAllButton")));
        button.click();
    }

    public List<String> getTeachersNames(WebDriver driver) {
        List<String> teachersNames = new ArrayList<>();
        List<TeachersCard> teachersCardsList = new ArrayList<>();
        for (WebElement card : teachersCards) {
            teachersCardsList.add(PageFactory.initElements(card, TeachersCard.class));
        }
        for (TeachersCard teacherCard : teachersCardsList) {
            teachersNames.add(teacherCard.getTeacherCardName());
        }
        return teachersNames;
    }
}



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
    private WebDriver driver;

    @FindBy(id = "coachesShowAllButton")
    private WebElement button;

    @FindBy(css = "div.coach-card_content")
    private List<WebElement> teachersCards;

    public FrontEndPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnButton() {
        String script = "window.scrollBy(0, 2500);";
        ((JavascriptExecutor) driver).executeScript(script);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("coachesShowAllButton")));
        button.click();
    }

    public List<TeachersCard> getTeacherCards() {
        List<TeachersCard> teacherCardsList = new ArrayList<>();
        for (WebElement card : teachersCards) {
            teacherCardsList.add(new TeachersCard(driver, card));
        }
        return teacherCardsList;
    }

    public List<String> getTeachersNames(List<TeachersCard> teacherCardsList) {
        List<String> teachersNames = new ArrayList<>();
        for (TeachersCard teacherCard : teacherCardsList) {
            teachersNames.add(teacherCard.getTeacherCardName());
        }
        return teachersNames;
    }
}



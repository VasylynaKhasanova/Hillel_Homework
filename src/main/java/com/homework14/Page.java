package com.homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Page {

    @FindBy(xpath = "//*[@id=\"body\"]/div/main/section[2]/div/div/div[1]/div/ul/li[1]/a/div/p[1]")
    private WebElement programCourse;

    @FindBy(xpath = "//*[@id=\"categories\"]/div[3]/div/ul/li[1]/div/div[1]/ul/li[1]/a/div[2]/p[1]")
    private WebElement frontEndCourse;

    @FindBy(css = "a.coach-card")
    private List<WebElement> teachersCards;

    @FindBy(xpath = "//*[@id=\"coachesSection\"]/div")
    private WebElement lazySection;

    @FindBy(id = "coachesShowAllButton")
    private WebElement button;


    public void clickOnProgramCourse() {
        programCourse.click();
    }

    public void clickOnFrontEndCourse() {
        frontEndCourse.click();
    }


    public void clickOnButton(WebDriver driver) {
        String script = "window.scrollBy(0, 2500);";
        ((JavascriptExecutor) driver).executeScript(script);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("coachesShowAllButton")));
        button.click();

    }

    public List<String> getTeachersNames() {
        List<String> teachersNames = new ArrayList<>();
        for (WebElement teacherCard : teachersCards) {
            WebElement name = teacherCard.findElement(By.cssSelector("p.coach-card_name"));
            teachersNames.add(name.getText());
        }

        return teachersNames;
    }
}

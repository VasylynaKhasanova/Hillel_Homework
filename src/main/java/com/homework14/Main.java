package com.homework14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromiumdriver().create();
        driver.get(ConfigProvider.BASE_URL);

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        ProgramingPage programingPage = PageFactory.initElements(driver, ProgramingPage.class);
        FrontEndPage frontEndPage = PageFactory.initElements(driver, FrontEndPage.class);

        homePage.clickOnProgramCourse();
        programingPage.clickOnFrontEndCourse();
        frontEndPage.clickOnButton(driver);

        List<TeachersCard> teacherCards = frontEndPage.getTeacherCards(driver);
        List<String> teachersNames = frontEndPage.getTeachersNames(teacherCards);
        System.out.println(teachersNames);

    }
}


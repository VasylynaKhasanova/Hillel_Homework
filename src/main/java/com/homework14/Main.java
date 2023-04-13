package com.homework14;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getDriver();
        driver.get(ConfigProvider.BASE_URL);

        HomePage homePage = new HomePage(driver);
        ProgramingPage programingPage = new ProgramingPage(driver);
        FrontEndPage frontEndPage = new FrontEndPage(driver);

        homePage.clickOnProgramCourse();
        programingPage.clickOnFrontEndCourse();
        frontEndPage.clickOnButton();

        List<TeachersCard> teacherCards = frontEndPage.getTeacherCards();
        List<String> teachersNames = frontEndPage.getTeachersNames(teacherCards);
        System.out.println(teachersNames);

        driver.quit();
    }
}


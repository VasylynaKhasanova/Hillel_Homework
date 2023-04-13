package com.homework15;

import com.homework14.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getDriver();
        driver.get(ConfigProvider.BASE_URL);

        TestingPage testingPage = new TestingPage(driver);

        List<TestCourse> testCourses = testingPage.getCoursesBlocks();
        List<String> courses = testingPage.getCourses(testCourses);
        System.out.println(courses);

        List<AdditionalCourse> additionalCourses = testingPage.getAdditionalCoursesBlocks();
        List<String> additionalCoursesNames = testingPage.getAdditionalCourses(additionalCourses);
        System.out.println(additionalCoursesNames);

        List<OpportunityBlock> opportunitiesBlocks = testingPage.getOpportunitiesBlocks();
        List<String> opportunities = testingPage.getOpportunities(opportunitiesBlocks);
        System.out.println(opportunities);

        testingPage.goToCategory("Програмування");

        driver.quit();
    }
}

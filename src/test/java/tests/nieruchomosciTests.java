package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.applicantPage;
import pageObject.defendantPage;
import pageObject.homePage;
import pageObject.summaryPage;

import java.util.concurrent.TimeUnit;

public class nieruchomosciTests {
    public static WebDriver driver;

    @BeforeEach
    void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test-ask.ridely.com/doc-wizard");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    void nieruchomosciTc01() {
        homePage homePage = new homePage(driver);
        homePage.clickNieruchomosci();
        applicantPage applicant = new applicantPage(driver);
        applicant.applicantSubmit();
        defendantPage defendant = new defendantPage(driver);
        defendant.odzyskajPosag();
        summaryPage summary = new summaryPage(driver);
        Assertions.assertAll(
                () -> Assertions.assertTrue(summary.statement()),
                () -> Assertions.assertTrue(summary.buttonEnabled()));
    }
    @Test
    void nieruchomosciTc02(){
        homePage homePage = new homePage(driver);
        homePage.clickNieruchomosci();
        applicantPage applicant = new applicantPage(driver);
        applicant.applicantSubmit();
        defendantPage defendant = new defendantPage(driver);
        defendant.ukryjSkarbiec();
        summaryPage summary = new summaryPage(driver);
        Assertions.assertAll(
                () -> Assertions.assertTrue(summary.statement()),
                () -> Assertions.assertTrue(summary.buttonEnabled()));
    }
    @Test
    void nieruchomosciTc03(){
        homePage homePage = new homePage(driver);
        homePage.clickNieruchomosci();
        applicantPage applicant = new applicantPage(driver);
        applicant.applicantSubmit();
        defendantPage defendant = new defendantPage(driver);
        defendant.wylaczNetflixa();
        summaryPage summary = new summaryPage(driver);
        Assertions.assertAll(
                () -> Assertions.assertTrue(summary.statement()),
                () -> Assertions.assertTrue(summary.buttonEnabled()));
    }

    @AfterEach
    void tearDown() {driver.quit();}
}

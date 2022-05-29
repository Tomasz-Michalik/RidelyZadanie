package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class defendantPage {
    private WebDriver driver;

    public defendantPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#mat-input-3")
    WebElement nameInput;
    @FindBy(css = "#mat-input-4")
    WebElement titleInput;
    @FindBy(css = "#mat-input-5")
    WebElement dropDown;

    @FindBy(css = "option[value=\"'odzyskaj posag'\"]")
    WebElement odzyskajPosagOption;
    @FindBy(css = "option[value=\"'ukryj skarbiec'\"]")
    WebElement ukryjSkarbiecOption;
    @FindBy(css = "option[value=\"'wyłącz netflixa'\"]")
    WebElement wylaczNetflixaOption;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement submitButton;



    public void odzyskajPosag() {
        nameInput.sendKeys("Karol Nowak");
        titleInput.sendKeys("nic złego");
        Select dropdown = new Select(driver.findElement(By.cssSelector("#mat-input-5")));
        dropdown.selectByIndex(0);
        submitButton.click();
    }
    public void ukryjSkarbiec() {
        nameInput.sendKeys("Karol Nowak");
        titleInput.sendKeys("nic złego");
        dropDown.click();
        Select dropdown = new Select(driver.findElement(By.cssSelector("#mat-input-5")));
        dropdown.selectByIndex(1);
        submitButton.click();
    }
    public void wylaczNetflixa() {
        nameInput.sendKeys("Karol Nowak");
        titleInput.sendKeys("nic złego");
        Select dropdown = new Select(driver.findElement(By.cssSelector("#mat-input-5")));
        dropdown.selectByIndex(2);
        submitButton.click();
    }
}

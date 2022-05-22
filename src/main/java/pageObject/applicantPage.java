package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class applicantPage {
    private WebDriver driver;

    public applicantPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#mat-input-0")
    WebElement nameInput;
    @FindBy(css = "#mat-input-1")
    WebElement titleInput;
    @FindBy(css = "#mat-input-2")
    WebElement money;
    @FindBy(css = "button[color$='primary']")
    WebElement dalejButton;

    public void applicantSubmit() {
        Random random = new Random();
        String number = String.valueOf(random.nextInt(1000) + 1);
        nameInput.sendKeys("Jan Kowalski");
        titleInput.sendKeys("Kupno nieruchomości");
        money.sendKeys(number);
        dalejButton.click();
    }
}

package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class summaryPage {
    private WebDriver driver;

    public summaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "div[class='summary ng-star-inserted'] p")
    WebElement statement;
    @FindBy(css = ".download-link > button")
    WebElement downloadButton;

    public boolean statement() {
        return statement.isDisplayed();
    }
    public boolean buttonEnabled() {
        return downloadButton.isEnabled();
    }
}

package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class homePage {
    private WebDriver driver;

    public homePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "div[class='mat-ripple block']")
    List<WebElement> homePageButtons;

    public void clickNieruchomosci() {
        homePageButtons.get(0).click();
    }
    public void clickSpadek() {homePageButtons.get(1).click();
    }
}

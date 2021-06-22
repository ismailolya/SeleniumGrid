package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartphonesPage extends BasePage{

    @FindBy(xpath = "//li[@class='portal-category__item']//a[contains(text(),'Apple')]")
    private WebElement smartphonesAppleButton;

    public SmartphonesPage(WebDriver driver) {
        super(driver);
    }

    public void clickSmartphonesApple(){
        smartphonesAppleButton.click();
    }
}

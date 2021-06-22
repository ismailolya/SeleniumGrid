package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SmartphonesApplePage extends BasePage{

    @FindBy(xpath = "//div[@data-product-id='4956273']//div[@title='Додати до порівняння']")
    private WebElement firstProductToCompare;

    @FindBy(xpath = "//div[@data-product-id='7073716']//div[@title='Додати до порівняння']")
    private WebElement secondProductToCompare;

    @FindBy(xpath = "//button[@class='compare-button compare-list__buttons-compare']")
    private WebElement clickToCompareButton;

    public SmartphonesApplePage(WebDriver driver) {
        super(driver);
    }

    public void addFirstProductToCompare(){
        firstProductToCompare.click();
    }

    public void addSecondProductToCompare(){
        secondProductToCompare.click();
    }

    public void checkToCompareProducts(){
        clickToCompareButton.click();
    }
}

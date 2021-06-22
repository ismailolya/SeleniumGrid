package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends BasePage {

    @FindBy(xpath = "//div[@class='products-layout__item products-layout__item--count']")
    private WebElement compareResultsProductsListText;

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public String getCompareResultsCount() {
        return compareResultsProductsListText.getText();
    }

}

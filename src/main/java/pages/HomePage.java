package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//li[@data-id='1516']")
    private WebElement smartphonesOnMenuListButton;

    @FindBy(xpath = "//div[@class='geo-label js-geo-label']")
    private WebElement currentCityButton;

    @FindBy(xpath = "//ul[@class='geolocation__cities']//li[@data-geo-select-city='Львів']//span")
    private WebElement selectLvivCityButton;

    @FindBy(xpath = "//div[@data-geo-label='Львів']")
    private WebElement currentCityAfterChange;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSmartphonesOnMenuList(){
        smartphonesOnMenuListButton.click();
    }



    public void clickCurrentCity(){
        currentCityButton.click();
    }

    public void changeCurrentCity(){
        selectLvivCityButton.click();
    }

    public String checkCurrentCityAfterChanged(){
        return currentCityAfterChange.getText();
    }

}

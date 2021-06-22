package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SmokeTests extends BaseTest{

    private static final long DEFAULT_WAITING_TIME = 200;


    @Test
    public void addProductsToCompare() throws InterruptedException {
        getHomePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        getHomePage().clickSmartphonesOnMenuList();
        getSmartphonesPage().clickSmartphonesApple();
        Thread.sleep(5000);
        getSmartphonesApplePage().addFirstProductToCompare();
        Thread.sleep(5000);
        getSmartphonesApplePage().addSecondProductToCompare();
        Thread.sleep(5000);
        getSmartphonesApplePage().checkToCompareProducts();
        getSmartphonesApplePage().waitForPageLoadComplete(DEFAULT_WAITING_TIME);
        assertTrue(getComparePage().getCompareResultsCount().contains("Додано товарів: 2"));
    }

    @Test
    public void changeCurrentCity() throws InterruptedException {
        Thread.sleep(5000);
        getHomePage().clickCurrentCity();
        getHomePage().changeCurrentCity();
        getSmartphonesApplePage().implicitWait(60);
        assertEquals(getHomePage().checkCurrentCityAfterChanged(), "Львів");
    }


}

package com.Example.AshwaPractice.Automation;


import com.Example.AshwaPractice.Automation.pages.SearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchTest {
    WebDriver driver;
    SearchPage searchPage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        searchPage = new SearchPage(driver);
    }

    @Test
    public void testSearchNonExistingProduct() throws InterruptedException {
        searchPage.searchForProduct("ld345tsxslfer");
        Assert.assertTrue(searchPage.getSearchResultText().contains("No results"), "No results found message should be displayed");
    }

    @Test
    public void testSearchExistingProduct() throws InterruptedException {
        searchPage.searchForProduct("Laptop");
        Assert.assertTrue(searchPage.getSearchResultText().contains("Laptop"), "Product results should contain 'Laptop'");
    }

    
    
    
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

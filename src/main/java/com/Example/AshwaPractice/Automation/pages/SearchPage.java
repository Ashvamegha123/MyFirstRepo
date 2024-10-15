package com.Example.AshwaPractice.Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    WebDriver driver;

    By searchBox = By.xpath("//input[@id='twotabsearchtextbox']");
    By searchButton = By.xpath("//input[@id='nav-search-submit-button']");
    By searchResultText = By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-size-medium a-color-base a-text-normal'])[4]");
    
    
    
    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchForProduct(String product) throws InterruptedException {
        driver.findElement(searchBox).sendKeys(product);
        Thread.sleep(1000);
        driver.findElement(searchButton).click();
        Thread.sleep(1000);
    }

    public String getSearchResultText() {
        return driver.findElement(searchResultText).getText();
    }
    
    
}

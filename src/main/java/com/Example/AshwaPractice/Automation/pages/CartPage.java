package com.Example.AshwaPractice.Automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By cartButton = By.id("nav-cart");
    By quantityDropdown = By.name("quantity");
    By deleteButton = By.xpath("//input[@value='Delete']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(cartButton).click();
    }

    public void updateQuantity(String quantity) {
        driver.findElement(quantityDropdown).sendKeys(quantity);
    }

    public void deleteProduct() {
        driver.findElement(deleteButton).click();
    }
}
package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utilities.Utility;
import org.openqa.selenium.By;

public class OvernightDufflePage extends Utility {

    By actualTextOverNightDuffle = By.xpath("//span[@class='base']");
    By changeQuantity = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By actualText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By viewAndEditCart = By.linkText("View and Edit Cart");

    public String getText() {
        return getTextFromElement(actualTextOverNightDuffle);
    }

    public void changeTheQuantity(String quantity) {
        sendTextToElement(changeQuantity, quantity);

    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getActualText() {
        return getTextFromElement(actualText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCart);
    }

}


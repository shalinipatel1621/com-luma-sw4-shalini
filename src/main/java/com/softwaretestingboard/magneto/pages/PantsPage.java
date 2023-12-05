package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

    By cronusPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By actualText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By addToCart = By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");


    public void mouseHoverOnCronusPant() {
        mouseHoverToElement(cronusPant);
    }

    public void clickOnSize32() {
        mouseHoverToElementAndClick(size32);
    }

    public void clickOnColourBlack() {
        mouseHoverToElementAndClick(colourBlack);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String getActualText() {
        return getTextFromElement(actualText);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);

    }



}


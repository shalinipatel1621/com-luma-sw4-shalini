package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By tops = By.id("ui-id-9");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//span[normalize-space()='Bags']");



    public void mouseHoverOnWomenMenu() {
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(tops);
    }

    public void mouseHoverAndClickOnJackets() {
        mouseHoverToElementAndClick(jackets);
    }

    public void mouseHoverOnMenMenu() {
        mouseHoverToElement(menMenu);
    }

    public void mouseHoverOnBottoms() {
        mouseHoverToElement(bottoms);
    }
    public void mouseHoverAndClickOnPants() {
        mouseHoverToElementAndClick(pants);
    }
    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }
    public void clickOnBags(){
        clickOnElement(bags);
    }
}



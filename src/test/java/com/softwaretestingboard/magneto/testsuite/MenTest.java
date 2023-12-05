package com.softwaretestingboard.magneto.testsuite;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.PantsPage;
import com.softwaretestingboard.magneto.pages.ShoppingCartPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    PantsPage pantsPage = new PantsPage();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void userShouldAddProductToShoppingCartSuccessfully() throws InterruptedException {


        //Mouse Hover on Men Menu
        Thread.sleep(2000);

        homePage.mouseHoverOnMenMenu();
        Thread.sleep(2000);

        //Mouse Hover On Bottoms
        Thread.sleep(2000);
        homePage.mouseHoverOnBottoms();


        //Mouse Hover and click on Pants
        homePage.mouseHoverAndClickOnPants();
        Thread.sleep(2000);

        //click on Cronus Yoga Pant
        pantsPage.mouseHoverOnCronusPant();

        //Click on size 32
        pantsPage.clickOnSize32();

        //click on colour black
        pantsPage.clickOnColourBlack();

        //click on add to cart
        pantsPage.clickOnAddToCart();
        Thread.sleep(2000);

        //Verify the text
        pantsPage.getActualText();
        Thread.sleep(2000);

        //click on shopping cart link
        pantsPage.clickOnShoppingCartLink();
        Thread.sleep(2000);

        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals(shoppingCartPage.getActualText(), "Shopping Cart", "Text is not displayed");

        //Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCartPage.getProductName(), "Cronus Yoga Pant", "Product name is not displayed");
        Thread.sleep(2000);

        //verify size 32

        String expectedProductSize = "32";
        String actualProductSize = shoppingCartPage.getProductSize().substring(0, expectedProductSize.length());
        Assert.assertEquals(actualProductSize, expectedProductSize);

        //Verify the product colour ‘Black’
        Assert.assertEquals(shoppingCartPage.getColour(), "Black", "Colour is not displayed");
    }
}

package com.softwaretestingboard.magneto.testsuite;

import com.softwaretestingboard.magneto.pages.BagsPage;
import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.OvernightDufflePage;
import com.softwaretestingboard.magneto.pages.ShoppingCartPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class GearTest extends BaseTest {
        HomePage homePage = new HomePage();
        BagsPage bagsPage = new BagsPage();
        OvernightDufflePage overNightDufflePage = new OvernightDufflePage();
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

        @Test
        public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {


            Thread.sleep(2000);

            //Mouse Hover on Gear menu
            homePage.mouseHoverOnGearMenu();
            Thread.sleep(2000);

            //Click on bags
            homePage.clickOnBags();
            Thread.sleep(2000);

            //Click on Overnight Duffle
            bagsPage.clickOnOverNightDuffle();

            //Verify Overnight duffle text
            Assert.assertEquals(overNightDufflePage.getText(),"Overnight Duffle","Text is not displayed");
            overNightDufflePage.changeTheQuantity(Keys.CONTROL + "a");
            overNightDufflePage.changeTheQuantity("3");
            Thread.sleep(2000);

            //Click on Add to cart
            overNightDufflePage.clickOnAddToCart();

            //Verify text
            Assert.assertEquals(overNightDufflePage.getActualText(),"You added Overnight Duffle to your shopping cart.","Text is not displayed");

            //Click on Shopping Cart link
            overNightDufflePage.clickOnShoppingCartLink();

            //Verify the name
            Assert.assertEquals(shoppingCartPage.getName(),"Overnight Duffle","Name is not displayed");

            //Verify Quantity is 3
            String expectedQuantity = "3";
            String actualQuantity = shoppingCartPage.getQuantity().substring(0, expectedQuantity.length());
            Assert.assertEquals(actualQuantity, expectedQuantity);


            //Verify the product price is $135.00
            Assert.assertEquals(shoppingCartPage.getPrice(),"$135.00","Price is not displayed");

            //Change QTY to 5
            shoppingCartPage.changeQuantityTo5(Keys.CONTROL + "a");
            shoppingCartPage.changeQuantityTo5("5");

            //Click on 'Update Shopping Cart' button
            shoppingCartPage.updateShoppingCart();
            Thread.sleep(2000);

            //Verify the product price $225.00
            String expectedSubTotal1 = "$225.00";
            String actualSubTotal1 = shoppingCartPage.getPrice().substring(0, expectedSubTotal1.length());
            Assert.assertEquals(actualSubTotal1, expectedSubTotal1);
        }
    }


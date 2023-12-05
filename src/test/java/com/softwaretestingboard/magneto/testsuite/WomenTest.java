package com.softwaretestingboard.magneto.testsuite;

import com.softwaretestingboard.magneto.pages.HomePage;
import com.softwaretestingboard.magneto.pages.JacketPage;
import com.softwaretestingboard.magneto.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    JacketPage jacketPage = new JacketPage();

    @Test
    public void verifyTheSortByProductNameFilter() {

        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //Mouse and click on jackets
        homePage.mouseHoverAndClickOnJackets();

        //sort jackets according to product name
        jacketPage.sortByProductName("Product Name");

        //verify the products name displayed in alphabetical order
        Assert.assertEquals(jacketPage.getProductList1(), jacketPage.getProductList2());
    }

    @Test
    public void verifyTheSortByPriceNameFilter() {
        //Mouse Hover on Women Menu
        homePage.mouseHoverOnWomenMenu();

        //Mouse Hover on Tops
        homePage.mouseHoverOnTops();

        //Mouse and click on jackets
        homePage.mouseHoverAndClickOnJackets();

        //sort jackets according to Price
        jacketPage.sortByPrice("Price");

        //verify
        Assert.assertEquals(jacketPage.getPriceList1(), jacketPage.getPriceList2());


    }

}

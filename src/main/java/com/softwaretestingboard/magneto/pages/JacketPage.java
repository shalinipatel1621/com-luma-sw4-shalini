package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class JacketPage extends Utility {
    By sortProduct = By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]");

    By sortPrice = By.id("sorter");

    public ArrayList<String> getProductList1() {

        List<WebElement> jacketsElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());


        }
        return (ArrayList<String>) jacketsNameListBefore;
    }


    public void sortByProductName(String filter) {
        selectByVisibleTextFromDropDown(sortProduct, filter);
    }

    //* Verify the products name display in alphabetical order

    public ArrayList<String> getProductList2() {
        List<WebElement> jacketsElementsList2 = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketsNameListAfter = new ArrayList<>();
        for (WebElement value1 : jacketsElementsList2) {
            jacketsNameListAfter.add(value1.getText());

        }
        return (ArrayList<String>) jacketsNameListAfter;
    }

    public List<Double> getPriceList1() {
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListBefore;

    }

    public void sortByPrice(String filter) {
        selectByVisibleTextFromDropDown(sortPrice, filter);
    }

    public List<Double> getPriceList2() {
        List<WebElement> jacketsPriceElementList = driver.findElements(By.xpath("//span[@class='price-wrapper ']//span"));
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        return jacketsPriceListAfter;

    }
}





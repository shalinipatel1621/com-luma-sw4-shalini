package com.softwaretestingboard.magneto.pages;

import com.softwaretestingboard.magneto.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    public void clickOnOverNightDuffle(){
        clickOnElement(overnightDuffle);
    }

}


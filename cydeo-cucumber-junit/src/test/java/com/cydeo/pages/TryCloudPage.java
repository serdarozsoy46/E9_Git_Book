package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudPage {


    public TryCloudPage(){
        PageFactory.initElements(com.cydeo.utilities.Driver.getDriver(),this);
    }
    @FindBy(name="user")
    public WebElement searchBox;
}

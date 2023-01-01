package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloud2LoginPage {

   public TryCloud2LoginPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//img[@src='/index.php/avatar/Employee53/32?v=0']")
public WebElement personalInfoBox;

@FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[4]/a")
    public WebElement logoutButton;

@FindBy(xpath = "//a[@class='active']")
    public WebElement DashBoard;

}

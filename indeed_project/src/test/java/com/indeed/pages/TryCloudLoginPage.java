package com.indeed.pages;

import com.indeed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryCloudLoginPage {

    public TryCloudLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(xpath ="//input[@name='user']")
    public WebElement inputUsername;

    @FindBy(xpath ="//input[@name='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@value='Log in']")
    public WebElement loginButton;

    @FindBy(xpath ="//a[@id='lost-password']")
    public WebElement ForgotPassword;

    @FindBy(xpath ="//p[@class='warning wrongPasswordMsg']")
    public WebElement WrongUsernameOrPassword;

@FindBy(xpath = "//img[@src='/core/img/actions/toggle.svg']")
public WebElement eyeimg;

@FindBy(xpath ="//input[@type='password']" )
public WebElement explicitly;


@FindBy(xpath = "//input[@value='Reset password']")
public WebElement ResetPassword;

@FindBy(xpath = "//input[@placeholder='Username or email']")
public WebElement UsernameOrEmail;

@FindBy(xpath = "//input[@placeholder='Password']")
public WebElement PasswordFields;


    public void login(){
        this.inputUsername.sendKeys("Employee53");
        this.inputPassword.sendKeys("Employee123");
        this.loginButton.click();
    }


    public void login(String Username, String Password) {
        inputUsername.sendKeys(Username);
        inputPassword.sendKeys(Password);
        loginButton.click();

    }

}

package com.indeed.step_definitions;

import com.indeed.pages.TryCloudLoginPage;
import com.indeed.utilities.ConfigurationReader;
import com.indeed.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TryCloud_stepDefinitions {

    TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();

    @Given("user is on the tryCloud login page")
    public void userIsOnTheTryCloudLoginPage() {
        String url = ConfigurationReader.getProperty("web.tryCloud2.url");
        Driver.getDriver().get(url);

    }

    @When("user enters username {string}")
    public void userEntersUsername(String username) {
        tryCloudLoginPage.inputUsername.sendKeys("Employee53");
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        tryCloudLoginPage.inputPassword.sendKeys("Employee123");
    }

    @And("user clicks to login Button")
    public void userClicksToLoginButton() {
        tryCloudLoginPage.loginButton.click();
    }

    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user should see dashboard");

    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        tryCloudLoginPage.inputUsername.sendKeys(username);
        tryCloudLoginPage.inputPassword.sendKeys(password);
        tryCloudLoginPage.loginButton.click();

    }

    @Then("user should see this message {string}")
    public void userShouldSeeThisMessage(String string) {
        String mes= tryCloudLoginPage.inputUsername.getAttribute("Wrong username or password.");
        String mes1=tryCloudLoginPage.inputPassword.getAttribute("Wrong username or password.");
        System.out.println(mes);
        System.out.println(mes1);
    }


    @Then("user should see this message in box {string}")
    public void userShouldSeeThisMessageInBox(String string) {
        String message = tryCloudLoginPage.inputUsername.getAttribute("validationMessage");
        String msg = tryCloudLoginPage.inputPassword.getAttribute("validationMessage");
        System.out.println(message);
        System.out.println(msg);

    }

    @When("user enters{string}")
    public void userEnters(String string) {
        tryCloudLoginPage.inputPassword.sendKeys("Employee123");
    }

    @And("user click to eye sign")
    public void userClickToEyeSign() {
        tryCloudLoginPage.eyeimg.click();
    }


    @Then("user see password dots form")
    public void userSeePasswordDotsForm() {
        tryCloudLoginPage.explicitly.sendKeys("Employee123");

    }

    @Then("user see password explicitly")
    public void userSeePasswordExplicitly() {
        tryCloudLoginPage.inputPassword.equals("Employee123");

    }

    @When("user clicks Forgot password on login page")
    public void userClicksForgotPasswordOnLoginPage() {
        tryCloudLoginPage.ForgotPassword.click();
    }


    @Then("user see Reset Password on the dashbord")
    public void userSeeResetPasswordOnTheDashbord() {
        tryCloudLoginPage.ResetPassword.getAttribute("ResetPassword");
    }

    @And("user see fields")
    public void userSeeFields() {
        tryCloudLoginPage.UsernameOrEmail.equals("Username or email");
        tryCloudLoginPage.PasswordFields.equals("Password");
    }



}


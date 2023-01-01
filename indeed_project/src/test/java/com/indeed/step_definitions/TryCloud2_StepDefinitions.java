package com.indeed.step_definitions;

import com.indeed.pages.TryCloud2LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class TryCloud2_StepDefinitions {

   TryCloud2LoginPage tryCloud2LoginPage = new TryCloud2LoginPage();


    @And("user enters personal info box")
    public void userEntersPersonalInfoBox() {
        tryCloud2LoginPage.personalInfoBox.click();
    }

    @Then("user click to log out button")
    public void user_enters_log_out_button() {
     tryCloud2LoginPage.logoutButton.click();
    }


 @And("user should see tryCloud page")
 public void userShouldSeeTryCloudPage() {

 }
}

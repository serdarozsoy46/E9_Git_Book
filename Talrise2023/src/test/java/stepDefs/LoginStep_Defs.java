package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.Login;

public class LoginStep_Defs {

    Login login = new Login();

    @Given("User makes request for login with valid information")
    public void userMakesRequestForLoginWithValidInformation() {
        login.loginWithValidInfo();
    }


    @Then("verify login with status code {int}")
    public void verifyLoginWithStatusCode(Integer statusCode){
        login.verifyStatuscode(statusCode);

    }

    @Given("user makes request to login with {string} and {string}")
    public void userMakesRequestToLoginWithAnd(String email, String password) {
        login.loginWithParameter(email,password);
    }


}

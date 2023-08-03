package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login=new P02_login();

    @Given("user go to login page")
    public void go_to_login(){
        login.loginLink().click();
    }

    @When("user login with valid email {string}")
    public void userLoginWithValidEmail(String email) {
        login.emailLogin().sendKeys(email);
    }

    @And("user login with valid password {string}")
    public void userLoginWithValidPassword(String password) {
        login.passwordLogin().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert check=new SoftAssert();
        check.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");

        check.assertTrue(Hooks.driver.getCurrentUrl().contains(login.myAccount().getText()));

    }

    @When("user login with invalid email {string}")
    public void userLoginWithInvalidEmail(String email) {
        login.emailLogin().sendKeys(email);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        String expected_message="Login was unsuccessful";
        SoftAssert check=new SoftAssert();
        check.assertTrue(login.unSuccessMessage().getText().contains(expected_message));
        String HexColor= Color.fromString(login.unSuccessMessage().getCssValue(  "color")).asHex();
        System.out.println(HexColor);
        check.assertEquals(HexColor, "#e4434b");
        check.assertAll();
    }
}

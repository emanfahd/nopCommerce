package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_register;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    //Create new object from P01_register
    P01_register register = new P01_register();

    @Given("user go to register page")
    public void go_to_register()
    {
        register.registerLink().click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {
        register.gender().click();
    }

    @And("user enter first name {string}")
    public void userEnterFirstName(String Firstname ) {
        register.firstname().sendKeys(Firstname);
    }

    @And("user enter last name {string}")
    public void userEnterLastName(String Lastname) {
        register.lastname().sendKeys(Lastname);
    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {
        register.Day().selectByValue("2");
        register.Month().selectByValue("12");
        register.Year().selectByValue("2000");
    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String Email) {
        register.email().sendKeys(Email);
    }

    @And("user fills Password field {string}")
    public void userFillsPasswordField(String Password) {
        register.password().sendKeys(Password);
    }

    @And("user fills Confirm Password Field {string}")
    public void userFillsConfirmPasswordField(String ConfirmPassword) {
        register.confirmPassword().sendKeys(ConfirmPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.register().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        //soft assertion
        String expected_message="Your registration completed";

        SoftAssert check=new SoftAssert();
        check.assertEquals(register.successMessage().getText(),expected_message);
        System.out.println("color is" +register.successMessage().getCssValue( "color"));

        check.assertTrue(register.successMessage().getCssValue( "color").contains("(76, 177, 124, 1)"));

        check.assertAll();
    }
}

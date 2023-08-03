package org.example.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class D04_searchStepDef {
   P03_HomePage search=new P03_HomePage();
   @Given("user go to homepage")
    public void go_to_homepage(){
       search.homepageLink();
   }


    @When("I enter product name as {string}")
    public void iEnterProductNameAs(String product_name) {
       search.searchBar().sendKeys(product_name);
        search.searchButton().click();
    }


    @When("I enter sku as {string}")
    public void iEnterSkuAs(String product_name) {
       search.searchBar().sendKeys(product_name);
        search.searchButton().click();
    }



    @Then("search result is displayed{string}")
    public void searchResultIsDisplayed(String sku) {
       search.searchResult().get(0).click();

       Assert.assertTrue(search.skuWords().getText().contains(sku));

    }


    @Then("product name is displayed {string}")
    public void productNameIsDisplayed(String product) {
        SoftAssert check=new SoftAssert();
        check.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q"));
        int resultSize= search.searchResult().size();
        for (int counter=0;counter<resultSize;counter++){
            String productName=search.searchResult().get(counter).getText();
            check.assertTrue(productName.toLowerCase().contains(product));
    }}
}


package org.example.StepDef;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.testng.Assert;



public class D07_followUsStepDef {
    P03_HomePage home=new P03_HomePage();

    @When("user opens facebook link")
    public void openFacebookLink() {
        home.clickOnFacebook().click();

        home.goFacebook();


    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String page) {

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),page);

    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() {
        home.clickOnTwitter().click();
        home.goTwitter();
    }

    @When("user opens rss link")
    public void userOpensRssLink() {
        home.clickOnRss().click();
        home.goRss();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.clickOnYoutube().click();
        home.goYoutube();
    }
}

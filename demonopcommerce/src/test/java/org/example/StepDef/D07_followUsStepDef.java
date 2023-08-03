package org.example.StepDef;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;

public class D07_followUsStepDef {
    P03_HomePage home=new P03_HomePage();

    @When("user opens facebook link")
    public void openFacebookLink() {
        home.clickOnFacebook().click();
       // Thread.sleep(2000);
        home.goFacebook();
       /* Set<String> tabs= Hooks.driver.getWindowHandles();

        Iterator<String> iterator= tabs.iterator();
        String tab0=iterator.next();
        String tab1=iterator.next();

        Hooks.driver.switchTo().window(tab1);*/

    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String page) {

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),page);
       // home.ReturnHome();
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

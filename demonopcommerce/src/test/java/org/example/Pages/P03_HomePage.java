package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class P03_HomePage {
    //elements
    By homepage_link=By.cssSelector("a[href=\"/\"]");
    //1.search
    By searchBar_field=By.id("small-searchterms");
    By searchButton_field=By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By sku=By.className("sku");
    By result = By.className("product-item");


    //2.follow us
    By facebookLink=By.linkText("Facebook");
    By twitterLink=By.linkText("Twitter");
    By rssLink=By.linkText("RSS");
    By youtubeLink=By.linkText("YouTube");

    //window handling

    //actions
    public WebElement homepageLink(){
        return Hooks.driver.findElement(homepage_link);
    }
    //1.search
    public WebElement searchBar(){
        return Hooks.driver.findElement(searchBar_field);
    }
    public WebElement searchButton(){
        return Hooks.driver.findElement(searchButton_field);
    }
    public  WebElement skuWords(){
      return Hooks.driver.findElement(sku);
    }
    public List<WebElement> searchResult(){
        return Hooks.driver.findElements(result);
    }
    //2. follow us

    //a.facebook
    public WebElement clickOnFacebook(){
        return Hooks.driver.findElement(facebookLink);
    }
    public WebDriver goFacebook(){
         Set<String> tabs= Hooks.driver.getWindowHandles();
         Iterator<String> iterator= tabs.iterator();
         String tab0=iterator.next();
         String tab1=iterator.next();

       return  Hooks.driver.switchTo().window(tab1);
    }
    //b. twitter
    public WebElement clickOnTwitter(){
        return Hooks.driver.findElement(twitterLink);
    }
    public WebDriver goTwitter(){
        Set<String> tabs= Hooks.driver.getWindowHandles();
        Iterator<String> iterator= tabs.iterator();
        String tab0=iterator.next();
        String tab1=iterator.next();

        return  Hooks.driver.switchTo().window(tab1);
    }
    //c.rss
    public WebElement clickOnRss(){
        return Hooks.driver.findElement(rssLink);
    }
    public WebDriver goRss(){
        Set<String> tabs= Hooks.driver.getWindowHandles();
        Iterator<String> iterator= tabs.iterator();
        String tab0=iterator.next();
        String tab1=iterator.next();

        return  Hooks.driver.switchTo().window(tab1);
    }
    //d.youtube
    public WebElement clickOnYoutube(){
        return Hooks.driver.findElement(youtubeLink);
    }
    public WebDriver goYoutube(){
        Set<String> tabs= Hooks.driver.getWindowHandles();
        Iterator<String> iterator= tabs.iterator();
        String tab0=iterator.next();
        String tab1=iterator.next();

        return  Hooks.driver.switchTo().window(tab1);
    }


}


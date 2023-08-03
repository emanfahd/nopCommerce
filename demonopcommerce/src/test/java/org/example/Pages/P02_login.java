package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
  // elements
    By loginTap=By.cssSelector("a[class=\"ico-login\"]");
    By email_field=By.id("Email");
    By password_field=By.id("Password");
    By login_button=By.cssSelector("button[class=\"button-1 login-button\"]");
    By myAccountTap=By.linkText("My account");
    By unSuccess_message=By.cssSelector("div[class=\"message-error validation-summary-errors\"]");

  // actions
  public WebElement loginLink(){
      return Hooks.driver.findElement(loginTap);
  }
    public WebElement emailLogin(){
        return Hooks.driver.findElement(email_field);
    }
    public WebElement passwordLogin(){
        return Hooks.driver.findElement(password_field);
    }
    public WebElement loginButton(){
        return Hooks.driver.findElement(login_button);
    }
    public WebElement myAccount(){
      return Hooks.driver.findElement(myAccountTap);
    }
  public WebElement unSuccessMessage(){
    WebElement actual_message=Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    return  Hooks.driver.findElement(unSuccess_message);
  }


}

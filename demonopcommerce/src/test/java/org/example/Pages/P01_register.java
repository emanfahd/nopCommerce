package org.example.Pages;

import org.example.StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    //elements
      By registerTap=By.cssSelector("a[class=\"ico-register\"]");
      By gender_field=By.id("gender-female");
      By firstname_field=By.id("FirstName");
      By lastname_field=By.id("LastName");
      By email_field=By.id("Email");
      By day_field=By.name("DateOfBirthDay");
      By month_field=By.name("DateOfBirthMonth");
      By year_field=By.name("DateOfBirthYear");
      By password_field=By.id("Password");
      By confirmPassword_field=By.id("ConfirmPassword");
      By registerButton=By.id("register-button");
      By success_message=By.className("result");
    public Select date;


    //actions

   // register button
    public WebElement registerLink()
    {
        return Hooks.driver.findElement(registerTap);
    }
    //gender
    public WebElement gender()
    {
        return Hooks.driver.findElement(gender_field);
    }

    //firstname field
    public WebElement firstname(){
         return Hooks.driver.findElement(firstname_field);
    }
    //lastname field
    public WebElement lastname(){
        return Hooks.driver.findElement(lastname_field);
    }
    //email field
    public WebElement email(){
        return Hooks.driver.findElement(email_field);
    }
    //password field
    public WebElement password(){
        return Hooks.driver.findElement(password_field);
    }
    //confirm password field
    public WebElement confirmPassword(){
        return Hooks.driver.findElement(confirmPassword_field);
    }
     //birthdate lists
    public Select Day(){
      return this.date = new Select(Hooks.driver.findElement(day_field));
    }
    public Select Month(){
        return this.date = new Select(Hooks.driver.findElement(month_field));
    }
    public Select Year(){
        return this.date= new Select(Hooks.driver.findElement(year_field));
    }
    public WebElement register(){
        return  Hooks.driver.findElement(registerButton);
    }
    public WebElement successMessage(){
        WebElement actual_message=Hooks.driver.findElement(By.className("result"));
        return  Hooks.driver.findElement(success_message);
    }

}

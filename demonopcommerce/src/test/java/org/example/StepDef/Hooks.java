package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void openBrowser(){

        // 2- create object from chrome browser
        driver=new ChromeDriver();

        //3- Configurations
        driver.manage().window().maximize(); //full window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//IMPLICIT WAIT

        // 4- navigate to url
        driver.get("https://demo.nopcommerce.com/");

    }
    @After
    public static void closeBrowser() {
        driver.quit();
    }

}

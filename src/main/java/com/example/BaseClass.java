package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","C:/Users/sergi/Automation/IdeaProjects/sample-cucumber-testng/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public static void navigateToHome(){
        driver.get("https://www.melia.com/es/home.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void navigateToRooms(){
        driver.get("https://www.melia.com/es/hoteles/espana/madrid/melia-castilla/habitaciones.htm?fechaEntrada=1621015200&fechaSalida=1621188000");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    public static void closeDriver(){
        driver.quit();
    }


}

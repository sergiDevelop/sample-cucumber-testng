package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LandPage extends BaseClass{

    public final static String acceptCookies = "didomi-notice-agree-button";
    public final static String destination = "mbe-destination-input";
    public final static String selectDestination = "//*[@id=\"too-be\"]/div[1]/div[2]/div[2]/div[1]/div[2]/ul[2]/li[2]";
    public final static String date = "mbe-dates-select";
    public final static String selectStartDate = "//*[@id=\"too-be\"]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[25]";
    public final static String selectEndDate = "//*[@id=\"too-be\"]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/ul/li[28]";
    public final static String btnAceptar = "//*[@id=\"mbe-rooms\"]/div[2]/div[4]/button";
    public final static String btnSearch = "mbe-search-button";

    public static void acceptCookies() { driver.findElement(By.id(acceptCookies)).click();}

    public static void enterDestination() {
        driver.findElement(By.id(destination)).click();
        driver.findElement(By.id(destination)).sendKeys("Barcelona");
        driver.findElement(By.id(destination)).sendKeys(Keys.TAB);
    }

    public static void clickStartDate() { driver.findElement(By.xpath(selectStartDate)).click();}

    public static void clickEndDate() { driver.findElement(By.xpath(selectEndDate)).click();}

    public static void clickAceptar() { driver.findElement(By.xpath(btnAceptar)).click();}

    public static void clickSearch() { driver.findElement(By.id(btnSearch)).click();}
}

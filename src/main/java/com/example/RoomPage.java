package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RoomPage extends BaseClass{

    public static String divRooms = "c-hotel-sheet-room";

    public static void numberRooms() {

        List<WebElement> allDivs = driver.findElements(By.className("divRooms"));

        if(allDivs.size() != 0)
        {
            System.out.println(allDivs.size() + " Elements found by class as c-hotel-sheet-room \n");

            for(WebElement inputElement : allDivs)
            {
                System.out.println(inputElement.getAttribute("placeholder"));
            }
        }
    }
}

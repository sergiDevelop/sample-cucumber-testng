package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.LandPage;
import com.example.RoomPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ObtenerNumHabStepDefs extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
        closeDriver();
    }

    @Given("Navigate to rooms page")
    public void navigate_to_rooms_page() {
        LandPage.navigateToRooms();
        LandPage.acceptCookies();
    }

    @Then("Count number of rooms")
    public void count_number_of_rooms() {
        RoomPage.numberRooms();
    }

}

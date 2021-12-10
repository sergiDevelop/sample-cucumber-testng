package com.example.StepDefinitions;

import com.example.BaseClass;
import com.example.LandPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RealizarBusquedaStepDefs extends BaseClass {

    @Before
    public void setup(){
        setDriver();
    }

    @After
    public void teardown(){
       closeDriver();
    }

    @Given("Navigate to melia page")
    public void navigate_to_melia_page() {
        LandPage.navigateToHome();
        LandPage.acceptCookies();
    }

    @When("User enter a destination")
    public void user_enter_a_destination() {
        LandPage.enterDestination();
    }

    @When("Select a date")
    public void select_a_date() {
        LandPage.clickStartDate();
        LandPage.clickEndDate();
        LandPage.clickAceptar();
    }

    @Then("Search availability")
    public void search_availability() {
        LandPage.clickSearch();
    }
}

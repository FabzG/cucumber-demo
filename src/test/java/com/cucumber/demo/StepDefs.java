package com.cucumber.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import com.cucumber.demo.services.DemoService;

public class StepDefs {


    ArrayList<String> data;

    @Given("i'm connected as root")
    public void connectAsRoot(){
        System.out.println("I'm root !");
    }

    @When("I ask for data")
    public void askForData(){
        this.data = DemoService.getAllData();
    }

    @Then("I get all I want")
    public void allIWant(){
        assertEquals(data.toString(),"[A, B, C]");
    }


    
}

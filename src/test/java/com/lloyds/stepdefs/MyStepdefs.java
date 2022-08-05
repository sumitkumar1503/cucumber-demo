package com.lloyds.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {
    static int num1,num2,result;
    @Given("I have two number {string} and {string}")
    public void i_have_two_number_and(String arg0, String arg1)  {
        num1=Integer.parseInt(arg0);
        num2=Integer.parseInt(arg1);
    }

    @When("I call addition method")
    public void iCallAdditionMethod() {
        result=num1+num2;
    }

    @Then("I should have output as {string}")
    public void iShouldHaveOutputAs(String arg0) throws Throwable {
        int sum=Integer.parseInt(arg0);
        if (sum!=result){
            throw new Exception("Result is incorrect");
        }
    }
}

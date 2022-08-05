package com.lloyds.acceptancetest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.lloyds.stepdefs"},
        features = "src/test/resources/",
        stepNotifications = true,
        plugin = {
                "pretty",
                "json:target/cucumber/cucumber.json",
                "html:target/cucumber/cucumber.html"

        }

)
public class RunnerClass {



}

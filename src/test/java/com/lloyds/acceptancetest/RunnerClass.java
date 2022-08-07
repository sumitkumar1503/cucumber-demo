package com.lloyds.acceptancetest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        glue = {"com.lloyds.stepdefs"},
        features = "src/test/resources/",
        stepNotifications = true,
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber.html"

        }
)
public class RunnerClass {
}

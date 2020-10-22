package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {

}

        // if we want to execute tags, which have two of them
        // Old Syntax = {"@login","@VYT-123"}
        // tags = "@login or @store_manager" == if we want to execute at the same time
        // tags = "@login not @store_manager" == if i want to execute tags, which have @login and not have @store_manager
        // Old Syntax = {"@login", "~@VYT-123"}


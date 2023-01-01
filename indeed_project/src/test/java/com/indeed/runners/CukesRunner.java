package com.indeed.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
            plugin = {"html:target/cucumber-report.html",
                    "json:target/cucumber.json",
            },
            features = "src/test/resources/features",
            glue = "com/indeed/step_definitions",
            dryRun = false,
            tags = "@CLOUD-1444"
            //  tags = "@Regression and not @student" executed regression
            // tags = "@Regression or admin" executed one tag
            // tags = "@Regression and librarion" executed both


)
    public class CukesRunner {

    }


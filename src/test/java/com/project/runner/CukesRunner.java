package com.project.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html", //html report
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/project/step_definitions",
        dryRun = true,
        tags = "@smoke"
)


public class CukesRunner {


}

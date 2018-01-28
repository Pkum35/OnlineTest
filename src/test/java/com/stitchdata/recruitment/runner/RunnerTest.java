package com.stitchdata.recruitment.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/"
        , glue = {"com.stitchdata.recruitment"}
        , plugin = {"pretty", "html:target/cucumber"}
)
public class RunnerTest {
}


package com.github.fernandocchaves.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/cucumber.json"},
        features = {"src/main/resources/features"}
)
public class CucumberRunnerTest {
}

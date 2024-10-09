package me.fanCodeCity.FanCode;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "me.fanCodeCity.FanCode.stepdefinitions",
        plugin = {
                "pretty",
                "html:target/fanCode-report.html"
        }
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
}

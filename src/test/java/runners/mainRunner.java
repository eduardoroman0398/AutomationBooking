package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:Features"}, glue = {"stepDefinitions"},
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags ="@Demo-auto" ,monochrome = true, dryRun = false)

public class mainRunner extends AbstractTestNGCucumberTests {

}


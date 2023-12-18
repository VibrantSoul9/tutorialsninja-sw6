package com.tutorialsninja.runners;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

/**
 * Created by Jigna
 */
@CucumberOptions( features = "src/test/resources/features" ,
        glue = "com/tutorialsninja/steps" ,
        plugin = {"html:target/cucumber-reports/cucumber.html" ,
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@regression and not @smoke")
 public class RunCukeTest extends AbstractTestNGCucumberTests {

}
//features pack under resources
//steps under test
//default report
//from info.txt, extent report
//for test output folder

package com.tutorialninja.utomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",glue = "com.tutorialninja.stepdef",tags = "@Register",plugin = {"html:target/cucumber_html_report.html"})
public class TestNGRunner extends AbstractTestNGCucumberTests{

}

package com.tutorialninja.utomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "com.tutorialninja.stepdef", plugin = {
		"html:target/cucumber_html_report.html" }, tags = "@Search or @Login or @Register")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}

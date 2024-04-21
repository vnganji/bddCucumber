package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features" ,glue= {"Steps"}, tags = "@staging and not @prod" ,plugin= {"html:target/cucumber-reports/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runCuke extends AbstractTestNGCucumberTests{

}

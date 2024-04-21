package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/searchCarparam.feature" ,glue= {"Steps"}, plugin= {"json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runCuke2 extends AbstractTestNGCucumberTests{

}

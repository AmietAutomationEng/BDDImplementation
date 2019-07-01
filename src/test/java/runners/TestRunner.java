package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "src/test/java/features",
		glue= {"stepDefinitions"},
		plugin = { "pretty","html:target/cucumber-reports"},
		monochrome = true
 )

public class TestRunner extends AbstractTestNGCucumberTests {
	
}

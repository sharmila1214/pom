package testOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },
		features = "C:\\Users\\sweet\\Downloads\\PageObjectModel-20201215T015334Z-001\\PageObjectModel\\src\\test\\java\\featureFile\\sales.feature",
		tags= {"@Smoke"} ,glue={"stepDefiniton"},dryRun=false)
public class textRunner extends AbstractTestNGCucumberTests  {
	
}

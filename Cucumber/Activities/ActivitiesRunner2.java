package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		 features="src/test/java/features",
		 glue = {"stepDefinitions"},	
		 tags = "@activity2",
		 plugin = {"json: test-reports/json-report.json"},
		 monochrome = true
		)
public class ActivitiesRunner2 {
	 //empty
}

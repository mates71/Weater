package chase.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin={"json:target/cucumber.json","html:target-cucumber/","rerun:target/rerun.txt" },
		
		features="src/test/resources/feature",
		
		glue="chase/stepDefns",
		
		tags="@weater",
		dryRun=false
		
		
		
		)

public class CukesRunner {
	
	
	

	
	
	
}

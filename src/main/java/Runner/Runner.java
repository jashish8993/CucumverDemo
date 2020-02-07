package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/Features",
		glue= {"seleniumgluecode"},
		dryRun= false, 
		//dryRun=true-----it means that Cucumber will only check that every Step mentioned in the Feature File has corresponding code written in Step Definition file or not. 
		monochrome=true,
		//monochrome=true-----If it is set as true, it means that the console output for the Cucumber test are much more readable.
		plugin={"pretty","html:Test-output"}
		)

public class Runner {

}
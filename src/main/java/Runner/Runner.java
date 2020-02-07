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

/*
Format Option is used to specify different formatting options for the output reports. Various options that can be used as for-matters are:
Pretty: Prints the Gherkin source with additional colors and stack traces for errors. Use below code:
format = {“pretty“}
HTML: This will generate a HTML report at the location mentioned in the for-matter itself. Use below code:
format = {“html:Folder_Name“}Format Option is used to specify different formatting options for the output reports. Various options that can be used as for-matters are:
Pretty: Prints the Gherkin source with additional colors and stack traces for errors. Use below code:
format = {“pretty“}
HTML: This will generate a HTML report at the location mentioned in the for-matter itself. Use below code:
 */
 


public class Runner {

}
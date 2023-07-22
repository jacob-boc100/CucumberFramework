package TestRunnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "E:/CHETAN'S DATA/NewAsusJavaWorkspace/cucumber_by_codestudio/src/test/java/Features/Login.feature",
		glue = "StepDefinition",
		//dryRun = true, //means only check mapping and implementation between feature file and step def file.
		dryRun=false,
		monochrome = true, //
		plugin = {"pretty",
				"html:target/cucumber-reports/reports1.html",
				"json:target/cucumber-reports/report1.json",
				"junit:target/cucumber-reports/report1.xml"
		
		} // to generate reports.
		
		
		
		
		)

public class TestRunner_class {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

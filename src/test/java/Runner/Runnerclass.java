package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		//Path of feature file
	features = {"C:\\Users\\91951\\eclipse-workspace_11_jan_BDD_cucumber\\11th_jan_BDD_cucumberFramwork\\src\\test\\resources\\Appfeatures"},	
		
		//Map/glue Test Steps with Methods of step definition class
	glue = {"StepDefination", "Hooks"},  //Packagename of Step defination Class
	
	plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}

	
	//publish=true
)

public class Runnerclass extends AbstractTestNGCucumberTests
{

}

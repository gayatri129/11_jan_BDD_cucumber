package Hooks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;

import QA.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class apphooks 
{
	Driverfactory df;
	 WebDriver driver;

@Before
public void LaunchBrowser() throws IOException
{
	
	FileInputStream file=new FileInputStream("C:\\Users\\91951\\eclipse-workspace_11_jan_BDD_cucumber\\11th_jan_BDD_cucumberFramwork\\src\\test\\resources\\config.properties");
	
	Properties prop=new Properties();
	prop.load(file);
	prop.getProperty("Browser");//chrome
	String BN=prop.getProperty("Browser");  //Chrome
	df=new Driverfactory();
	driver=df.initBrowser(BN);  // //Chrome
	driver.manage().window().maximize();

}

@After
public void teardown()
{
	driver.quit();
}


@AfterStep
public void postStepaction(io.cucumber.java.Scenario sc) throws IOException 
{
byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", screenshot.toString());
	
}
/*
@AfterStep
public void postStepaction(io.cucumber.java.Scenario sc) throws IOException 
{
		if(sc.isFailed()) 
		{
		byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/png", screenshot.toString());
		}
	}
	*/

}




	



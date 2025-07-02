package QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driverfactory 
{
static WebDriver driver;//jab tak runner class chalega means step def class chalega tab tk driver ki value chalegi
//agar hum static nahi banate to yek operation ke baad value release ho jati h agar nonstatic rahti h to
	
	public WebDriver initBrowser(String Browsername) 
	{
		  
		if(Browsername.equals("Chrome")) 
		{
			driver=new ChromeDriver();
		}	    
		else if(Browsername.equals("Firefox")) 
		{
			driver=new FirefoxDriver();
		}
		
		return driver;//return for maximize browser driver related acttivity ke liye
		//ye driver browser bhi open karegi or baki activity bhi
	}
	
	
	public static WebDriver getdriver() 
	{
		return driver;
	}
	

}

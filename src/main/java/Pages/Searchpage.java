package Pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage
{
	 //POM
	
		WebDriver driver;
		
		//1. Instance variables/ Data members should be declared  with access level private by using @Findby Annotation	
		
		@FindBy(xpath="(//input[@name='search'])[1]") private  WebElement Searchfield;  //driver.findElement(By.xpath("(//input[@name='search'])[1]"));
		@FindBy(xpath="//button[@class='btn btn-default btn-lg']") private  WebElement Searchbtn;  //driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		@FindBy(xpath="//a[text()='MacBook']") private  WebElement MB; //driver.findElement(By.xpath("//a[text()='MacBook']"));
		@FindBy(xpath="//a[text()='MacBook Air']") private  WebElement MBA; //driver.findElement(By.xpath("//a[text()='MacBook Air']"));
		@FindBy(xpath="//a[text()='MacBook Pro']") private  WebElement MBP; //driver.findElement(By.xpath("//a[text()='MacBook Pro']"));
		
		
		//2. Initialize within a constructor with access level public using PageFactory Class 
		
		public Searchpage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		  //3. Utilize within a method with access level public
		
		public void enterproductnameinserach(String prodcutname)   ////MacBook
		{
			Searchfield.sendKeys(prodcutname);  ///MacBook
		}
		
		public void clickasearchbutton() 
		{
			Searchbtn.click();
		}
		
		public ArrayList<String> verifysearchedproduct() 
		{	
			String product1=MB.getText();  //MacBook
			String product2=MBA.getText();  //MacBook Air
			String product3=MBP.getText();  //MacBook Pro
			
			ArrayList<String> al=new ArrayList<String>();
			
			   al.add(product1);
			   al.add(product2);
			   al.add(product3);
			   
			   return al;  ////MacBook  ////MacBook Air  //MacBook Pro
		}
		

}

package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
  
 //POM
	
 	WebDriver driver;
 	
 	//1. Instance variables/ Data members should be declared  with access level private by using @Findby Annotation	
 	  @FindBy(xpath="//span[text()='Shopping Cart']")  private WebElement ShoppingCart;  //driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
 	  @FindBy(xpath="//a[text()='iPhone']") private WebElement Iphone;  //driver.findElement(By.xpath("//a[text()='iPhone']"));
 	  @FindBy(xpath="//a[text()='Apple']") private WebElement Brandname; //driver.findElement(By.xpath("//a[text()='Apple']"));
 	  @FindBy(xpath="//span[text()='My Account']") private WebElement Myacc; //driver.findElement(By.xpath("//span[text()='My Account']"));
 	  @FindBy(xpath="//a[text()='Login']") private WebElement Loginoption;   //driver.findElement(By.xpath("//a[text()='Login']"));
 	  @FindBy(xpath="//input[@name='email']") private WebElement Emailadd;  //driver.findElement(By.xpath("////input[@name='email']"));
 	  @FindBy(xpath="//input[@name='password']") private WebElement Password; //driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
 	  @FindBy(xpath="//input[@class='btn btn-primary']") private WebElement loginbtn; //driver.findElement(By.xpath("//a[text()='Apple']"));
 	  @FindBy(xpath="//h2") private WebElement Myaccountpage;//driver.findElement(By.xpath("//h2"));

 	  
//2. Initialize within a constructor with access level public using PageFactory Class  
	  
	  public Homepage(WebDriver driver)  
	  {
		 this.driver =driver;   
		 PageFactory.initElements(driver, this);
	  }
	  
	  
	  //3. Utilize within a method with access level public
	  
	  public String gettitleofpage() 
	  {
		String  title=driver.getTitle();  //Your Store
		return title;  //Your Store
	  }
	  
	  public boolean verifyshoppingcart() 
	  {
		boolean  icon=ShoppingCart.isDisplayed();   //true  false
		return icon;  //true  false
	  }
	  
	  
	  public void clickoniphone() 
	  {
		  Iphone.click();
	  }
	  public String getbrandname() 
	  {
		String brand=Brandname.getText();   //Apple
		return brand;  //Apple
	  }
	  
	  public void clickmyaccount() 
	  {
		  Myacc.click();
	  }
	  
	  public void clickloginoption()
	  {
		  Loginoption.click();
	  }
	  
	  public void enteremailaddress(String emailaddress) 
	  {	  
		  Emailadd.sendKeys(emailaddress);
		  
	  }
	  
	  public void enterpassword(String Pass) 
	  {
		  Password.sendKeys(Pass);
	  }
	  
	  public void clickloginbutton() 
	  {
		  loginbtn.click();
       }
	  
	 public String verifymyaccountpage() {
		 String text=Myaccountpage.getText();  
		 return text;
	 }
	
}
package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.Homepage;
import QA.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_step_def
{
	
	Homepage hp=new Homepage(Driverfactory.getdriver());  //driver

	@Given("the user is at the Homepage")
	public void the_user_is_at_the_homepage()
	{
		WebDriver driver=Driverfactory.getdriver();  //driver
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");

	}
	@Then("page title should contain {string}")  //Your Store
	public void page_title_should_contain(String ExpectedTitle)
	{
	 String  Actualtitle=hp.gettitleofpage();  ////Your Store
	 Assert.assertEquals(Actualtitle, ExpectedTitle);
	}

	@Then("shopping cart icon should be displayed")
	public void shopping_cart_icon_should_be_displayed() 
	{
	   boolean icon=hp.verifyshoppingcart();  //true  false
	   Assert.assertTrue(icon);
	}

	@When("user clicks on iPhone")
	public void user_clicks_on_i_phone() 
	{
	   hp.clickoniphone();
	}

	@Then("user should able to see brand name {string}") //Apple
	public void user_should_able_to_see_brand_name(String ExpectedBrandname)
	{
	  String  ActualBrandname=hp.getbrandname();  //Apple
	  Assert.assertEquals(ActualBrandname, ExpectedBrandname);
	}

	@When("user clicks on my account dropdown")
	public void user_clicks_on_my_account_dropdown() 
	{
	 hp.clickmyaccount();
	}

	@When("user clicks on login option")
	public void user_clicks_on_login_option() 
	{
     hp.clickloginoption();
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String EM , String PSW )
	{
	   hp.enteremailaddress(EM);
	   hp.enterpassword(PSW);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() 
	{
	   hp.clickloginbutton();
	}

	@Then("user should be redirected to the {string} page")
	public void user_should_be_redirected_to_the_page(String Expectedpage) throws InterruptedException 
	{
		
		Thread.sleep(3000);
		String  Actualpage=  hp.verifymyaccountpage();//My Account
	       Assert.assertEquals( Actualpage,Expectedpage);
	}



}

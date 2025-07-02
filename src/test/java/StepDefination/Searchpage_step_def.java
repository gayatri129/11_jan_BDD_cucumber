package StepDefination;

import java.util.ArrayList;

import org.testng.Assert;

import Pages.Searchpage;
import QA.Driverfactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchpage_step_def 
{
	
	Searchpage sp=new Searchpage(Driverfactory.getdriver());
	
	@When("user searches {string}")//macbook
	public void user_searches(String Searchproduct) 
	{
	    sp.enterproductnameinserach(Searchproduct);
	    sp.clickasearchbutton();
	}

	@Then("user should be able to see {string}, {string} and {string}")
	public void user_should_be_able_to_see_and(String ExpectedProduct1, String ExpectedProduct2, String ExpectedProduct3) throws InterruptedException 
	{
		ArrayList<String> Products=sp.verifysearchedproduct();  //MacBook  ////MacBook Air  //MacBook Pro
		
        String  ActualProduct1=Products.get(0);  //MacBook
        String  ActualProduct2=Products.get(1);  //MacBook Air  
        String  ActualProduct3=Products.get(2);  //MacBook Pro
        
Assert.assertEquals(ActualProduct1, ExpectedProduct1);
Thread.sleep(2000);
Assert.assertEquals(ActualProduct2, ExpectedProduct2); 
Thread.sleep(2000);
Assert.assertEquals(ActualProduct3, ExpectedProduct3);   	
}


	}



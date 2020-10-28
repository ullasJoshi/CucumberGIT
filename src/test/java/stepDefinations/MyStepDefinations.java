package stepDefinations;

import Automation.AutomateRSAcademy.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import pageObjects.CheckOut;
import pageObjects.HomePage;


public class MyStepDefinations extends Base{	

	
	HomePage hp;
	CheckOut co;


	@Given("^User is on the landing page$")
	public void user_is_on_the_landing_page() throws Throwable {

		

	}
	@When("^searched for \"([^\"]*)\" vegitable$")
	public void searched_for_vegitable(String arg1) throws Throwable {
		 
		 
	
		 hp =new HomePage (driver);
		
		
			
		 hp.getSearch(arg1);

			Thread.sleep(3000);
    }
	@When("^searched for 'Tomato' vegitable$")
	public void searched_for_Tomato_vegitable() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	    hp =new HomePage (driver);
		
		
		
		 hp.getSearch().sendKeys("Tomato");

			Thread.sleep(3000);
			throw new PendingException();
	}



	
	@Then("^Only \"([^\"]*)\" result is displayed$")
	public void only_result_is_displayed(String arg1) throws Throwable {

		hp =new HomePage (driver);

		hp.getProduct().getText().contains(arg1);


	}


	@When("^Select One Item to cart$")
	public void select_one_item_to_cart() throws Throwable {
		co = new CheckOut (driver);

		co.addProduct().click();

		co.addToCart().click();	    	

	}

	@When("^Click on CheckOut$")
	public void click_on_checkout() throws Throwable {

		co = new CheckOut (driver);

		co.Cart().click();

		Thread.sleep(2000);


	}

	 
	@Then("^Only (.+) result is displayed in CheckedOut page$")
	public void only_something_result_is_displayed_in_checkedout_page(String strArg1) throws Throwable {
		
		co = new CheckOut (driver);

		co.proceedCheckOut().click();

		Thread.sleep(2000);
		
		System.out.println(co.productName().getText());
	//	Assert.assertTrue(co.productName().getText().contains(strArg1+" - 1 Kg"));
		co.productName().getText().contains(strArg1);

	}
	
	@Given("^User is in the landing page$")
    public void user_is_in_the_landing_page() throws Throwable {
       
    }

	 @When("^search for \"([^\"]*)\" vegitable$")
	    public void search_for_something_vegitable(String strArg1) throws Throwable {
    	
    	 hp =new HomePage (driver);
 		
 		
 		
		 hp.getSearch().sendKeys(strArg1);

			Thread.sleep(3000);
			
        
    }

	 @Then("^Only \"([^\"]*)\" is displayed in CheckedOut page$")
	    public void only_something_is_displayed_in_checkedout_page(String strArg1) throws Throwable {
    	co = new CheckOut (driver);

		co.proceedCheckOut().click();

		Thread.sleep(2000);
		
		System.out.println(co.productName().getText());
	
		co.productName().getText().contains(strArg1);
    }

    @When("^Select the Item to cart$")
    public void select_the_item_to_cart() throws Throwable {
    	co = new CheckOut (driver);

		co.addProduct().click();

		co.addToCart().click();	    	

    }

    @When("^Click on CheckOut Option$")
    public void click_on_checkout_option() throws Throwable {
    	co = new CheckOut (driver);

		co.Cart().click();

		Thread.sleep(2000);
    }

	 

	  
	   
}



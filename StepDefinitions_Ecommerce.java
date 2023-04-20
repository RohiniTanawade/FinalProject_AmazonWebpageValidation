package step_Definitions;

import PageObjectRepository_POR.PageObjects_E_Comerce;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions_Ecommerce {

	PageObjects_E_Comerce obj=new PageObjects_E_Comerce();
	
	@Given("I am on the shopping website")
	public void i_am_on_the_shopping_website() throws InterruptedException {
	   obj.LaunchApplication();
	   Thread.sleep(2000);
	}

	@When("I search for {string} in the search bar")
	public void i_search_for_in_the_search_bar(String string) throws InterruptedException {
	    obj.searchElement("shoes");
	    Thread.sleep(2000);
	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() throws InterruptedException {
	  obj.clickButton();
	   Thread.sleep(2000);
	}

	@Then("I should see a list of search results for {string}")
	public void i_should_see_a_list_of_search_results_for(String string) throws InterruptedException {
	    obj.listSearchResult("shoes");
	    Thread.sleep(4000);
	}

	@Then("the search results should contain at least {int} products")
	public void the_search_results_should_contain_at_least_products(Integer int1) throws InterruptedException {
	    obj.searchResultListMinFiveProduct(5);
	    Thread.sleep(4000);
	}
	
	@When("I hower the mouse on All searchDropdownBox it shows the ToolTip search in")
	public void i_hower_the_mouse_on_all_search_dropdown_box_it_shows_the_tool_tip_search_in() throws InterruptedException {
		obj.searchDropDownBox();
		 Thread.sleep(2000);
	}

	@When("I should click on Best sellers it shows the results")
	public void i_should_click_on_best_sellers_it_shows_the_results() throws InterruptedException {
	    obj.bestSellers();
	    Thread.sleep(2000);
	}
    
	@When("I click on Hello select your address")
	public void i_click_on_hello_select_your_address() throws InterruptedException {
	    obj.helloSelectYourAddress();
	    Thread.sleep(2000);
	}

	@When("I give {string} pincode in textbox")
	public void i_give_pincode_in_textbox(String string) throws InterruptedException {
	    obj.addPincodeInTextBox();
	    Thread.sleep(2000);
	}

	@Then("I click on apply")
	public void i_click_on_apply() throws InterruptedException {
	   obj.clickOnApplyButton();
	   Thread.sleep(2000);
	}
	
	@Then("close Browser")
	public void close_browser() {
	    obj.closeBrowser();
	}
	
	}

	


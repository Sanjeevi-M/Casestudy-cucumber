package searchproduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchprod {
	WebDriver driver;
	@Given("User enters into login page")
	public void user_enters_into_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver=UtilityClass.getDriver("Chrome");
		 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	    
	}

	@Given("User enters the username {string}")
	public void user_enters_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement( By.name("userName")).sendKeys(string);
	}

	@Given("User entersthe password {string}")
	public void user_entersthe_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	   
	}

	@When("User clicks the Login Button")
	public void user_clicks_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("home page displayed");
	}

	@Then("User type the product name in search box {string}")
	public void user_type_the_product_name_in_search_box(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("myInput")).sendKeys("HeadPhone");
	    
	}

	@Then("User click the search button")
	public void user_click_the_search_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	 
	}

	@Then("the product page is displayed")
	public void the_product_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("product is displayed");
	    
	}

}

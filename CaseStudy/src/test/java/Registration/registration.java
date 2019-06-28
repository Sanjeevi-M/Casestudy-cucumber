package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.CaseStudy.UtilityClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class registration {
	WebDriver driver;
	@Given("opens the TestMeApp homepage")
	public void opens_the_TestMeApp_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	   driver=UtilityClass.getDriver("chrome");
	  
	     driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}
	@Given("user clicks signup button")
	public void user_clicks_signup_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("SignUp")).click();
	}

	@Given("username {string}")
	public void username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("userName")).sendKeys(string);
	}

	@Given("firstname {string}")
	public void firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("firstName")).sendKeys(string);
	}

	@Given("lastname {string}")
	public void lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("lastName")).sendKeys(string);
	}

	@Given("password {string}")
	public void password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@Given("confirmpassword {string}")
	public void confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass_confirmation")).sendKeys(string );
	}

	@Given("gender {string}")
	public void gender(String string) {
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.xpath("//*[@id='gender']")).click();
	}

	@Given("email {string}")
	public void email(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("emailAddress")).sendKeys(string);
	}

	@Given("number {string}")
	public void number(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("mobileNumber")).sendKeys(string);
	}

	@Given("dob {string}")
	public void dob(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("dob")).sendKeys(string);System.out.println(string);
	}

	@Given("address {string}")
	public void address(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("address")).sendKeys(string);
	}

	@Given("securityquestion")
	public void securityquestion() {
	    // Write code here that turns the phrase above into concrete actions
		Select question = new Select(driver.findElement(By.id("securityQuestion")));
		   question.selectByValue("411011");
	    
	}

	@Given("answer")
	public void answer() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("answer")).sendKeys("blue");
	    
	}

	@When("click button register")
	public void click_button_register() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Submit")).click();
	   
	}

	@Then("user redirected to the login page")
	public void user_redirected_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("reg successful");
	  
	}

}

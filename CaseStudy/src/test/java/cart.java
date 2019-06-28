import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class cart {
	WebDriver driver;
	@Given("User loggin TestMeApp")
	public void user_loggin_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver=UtilityClass.getDriver("Chrome"); 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm"); 
		driver.manage().window().maximize(); 
		driver.findElement( By.name("userName")).sendKeys("lalitha"); 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123"); 
		driver.findElement(By.name("Login")).click(); 
		Assert.assertEquals(driver.getTitle(),"Home");
		} 
		@And("User searched for the product {string}")

	
	@Given("User searches for the product {string}")
	public void user_searches_for_the_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
			driver.findElement(By.id("myInput")).sendKeys(string);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			}

	

	@Given("without clicking Add To Cart button user trying to purchase the item")
	public void without_clicking_Add_To_Cart_button_user_trying_to_purchase_the_item() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Tried to purchase item withoutclickiing Add to cart");

	}

	@Then("Error shown because of invalid process")
	public void error_shown_because_of_invalid_process() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getTitle(), "View Cart"); 
	    System.out.println("Error loading the page withoutclicking Add to cart");

	}

	@Given("User logs into the account")
	public void user_logs_into_the_account() {
	    // Write code here that turns the phrase above into concrete actions
		driver=UtilityClass.getDriver("Chrome"); 
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm"); 
		driver.manage().window().maximize(); 
		driver.findElement( By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password123"); 
		driver.findElement(By.name("Login")).click();
		Assert.assertEquals(driver.getTitle(),"Home");

		}

	

	@Given("User searches the product in the TestMeApp {string}")
	public void user_searches_the_product_in_the_TestMeApp(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("myInput")).sendKeys(string); 
		driver.findElement(By.xpath("//input[@type='submit']")).click();		 
		Assert.assertEquals(driver.getTitle(),"Search");
		}


	@Given("User clicks the Add To Cart button")
	public void user_clicks_the_Add_To_Cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		String cartNo=driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).getText(); 
		System.out.println(cartNo); 
		Assert.assertEquals("1",cartNo);
      
		}


	@Given("Product added to the Cart")
	public void product_added_to_the_Cart() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Product successfully added to the cart");

	}

	@Given("User clicks the Add to cart button")
	public void user_clicks_the_Add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/a[2]/b")).click();
	}


	@Given("Checkout page is dispalyed")
	public void checkout_page_is_dispalyed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Checkout page displayed");

	}


	@When("User clicks Checkout button")
	public void user_clicks_Checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='cart']/tfoot/tr[2]/td[5]/a")).click();
	}

	@Then("The payment page is displayed")
	public void the_payment_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Payment page displayed");

	}


	@Then("User clicks the proceed to pay button")
	public void user_clicks_the_proceed_to_pay_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();

	}


	@Then("Page redirected to the payment gateway")
	public void page_redirected_to_the_payment_gateway() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h3")));

		}


	@Then("User clicks the Bank name for payment")
	public void user_clicks_the_Bank_name_for_payment() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='swit']/div[1]/div/label")).click(); 
		 
		driver.findElement(By.id("btn")).click();
		 
		Assert.assertEquals(driver.getTitle(), "Payment Gateway");

		}

	@Then("User enters the Username")
	public void user_enters_the_Username() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("username")).sendKeys("123456");

	}


	@Then("User enters the password for banking")
	public void user_enters_the_password_for_banking() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("password")).sendKeys("Pass@456");

	}


	@Then("User clicks the continue option")
	public void user_clicks_the_continue_option() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='horizontalTab']/div[2]/div/div/div/div/form/div/div[3]/input")).click();

	}


	@Then("Transaction page is displayed")
	public void transaction_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("transaction page is displayed");

	}


	@Then("User enters the Transaction password")
	public void user_enters_the_Transaction_password() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
	}

	@When("User clicks the Proceed button")
	public void user_clicks_the_Proceed_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\'horizontalTab\']/div[2]/div/div/div/div/form/div/div[2]/input")).click();
	}

	@Then("the order confirmed page displayed")
	public void the_order_confirmed_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getTitle(), "Order Details");
	}
	

}

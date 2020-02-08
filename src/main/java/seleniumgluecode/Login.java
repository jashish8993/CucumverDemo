package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
 public static WebDriver driver;
 Select select;
 
 @Before(order=0)
 public void setup()
 {
	 System.out.println("inside before tag");
 }
 @Before(order=1)
 public void setup1()
 {
	 System.out.println("inside before tag i will be executed with priority 1");
 }
 
 
 @After//global hooks
 public void teardown()
 {
	 System.out.println("inside after tag");
 }
 @After("@First")//local hooks
 public void method()
 {
	 System.out.println("it will be executed just after first tag scenario");
 }
 //without Example kyword
	@Given("^user launches the url$")
	public void user_launches_the_url() throws Throwable {
	 System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://icrctest.vecnacares.org/openmrs/");
	  
	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(9000);
	   
	}

	@Then("^user Selects the login location and then clicks on Login button again$")
	public void user_Selects_the_login_location_and_then_clicks_on_Login_button_again() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='AF - AGHOZANU AREA']")).click();
	  driver.findElement(By.id("loginButton")).click();
	   
	}

	

// with example keyword
	@Given("^User clicks on Register a HSu button$")
	public void user_clicks_on_Register_a_HSu_button() throws Throwable {
		driver.findElement(By.id("pearl-registration-configuration-homepageLink-pearl-registration-configuration-homepageLink-extension")).click();

	}

	@Then("^User enters name in \"(.*)\" and \"(.*)\" field$")
	public void user_enters_name_in_Given_and_Family_name_field(String given, String family) throws Throwable {
		driver.findElement(By.name("givenName")).sendKeys(given);
		driver.findElement(By.name("familyName")).sendKeys(family);

	}

	@Then("^user selects Gender$")
	public void user_selects_Gender() throws Throwable {
		select=new Select(driver.findElement(By.id("gender-field")));
		select.selectByValue("M");

	}

	@Then("^user clicks on Confirm Tab$")
	public void user_clicks_on_Confirm_Tab() throws Throwable {
		driver.findElement(By.id("confirmation_label")).click();

	}

	@Then("^user clicks on Confirm button$")
	public void user_clicks_on_Confirm_button() throws Throwable {
		driver.findElement(By.id("submit")).click();
	}
	@Then("^go to Homepage$")
	public void go_to_Homepage() throws Throwable
	{
		Thread.sleep(2000);
		driver.get("https://icrctest.vecnacares.org/openmrs/referenceapplication/home.page");
		Thread.sleep(3000);
		
		
	}

	
}

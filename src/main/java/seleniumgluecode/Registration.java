package seleniumgluecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Registration {
 public static WebDriver driver;
 Select select;
 
 //without Example kyword
	@Given("^users launches the url$")
	public void user_launches_the_url() throws Throwable {
	 System.setProperty("webdriver.gecko.driver", "Driver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://icrctest.vecnacares.org/openmrs/");
	  
	}

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}

	@Then("^user click on Login button$")
	public void user_clicks_on_Login_button() throws Throwable {
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(9000);
	   
	}

	@Then("^user Select the login location and then clicks on Login button again$")
	public void user_Selects_the_login_location_and_then_clicks_on_Login_button_again() throws Throwable {
	  driver.findElement(By.xpath("//*[@id='AF - AGHOZANU AREA']")).click();
	  driver.findElement(By.id("loginButton")).click();
	   
	}

	

// with example keyword
	@Given("^User click on Register a HSu button$")
	public void user_clicks_on_Register_a_HSu_button() throws Throwable {
		driver.findElement(By.id("pearl-registration-configuration-homepageLink-pearl-registration-configuration-homepageLink-extension")).click();

	}

	@Then("^User enter name in Firstname and Lastname field$")
	public void user_enters_name_in_Given_and_Family_name_field(DataTable username ) throws Throwable {
		List<List<String>> data=username.raw();
		driver.findElement(By.name("givenName")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("familyName")).sendKeys(data.get(0).get(1));

	}

	@Then("^user select Gender$")
	public void user_selects_Gender() throws Throwable {
		select=new Select(driver.findElement(By.id("gender-field")));
		select.selectByValue("M");

	}

	@Then("^user click on Confirm Tab$")
	public void user_clicks_on_Confirm_Tab() throws Throwable {
		driver.findElement(By.id("confirmation_label")).click();

	}

	@Then("^user click on Confirm button$")
	public void user_clicks_on_Confirm_button() throws Throwable {
		driver.findElement(By.id("submit")).click();
	}
	@Then("^go to the Homepage$")
	public void go_to_Homepage() throws Throwable
	{
		Thread.sleep(2000);
		driver.get("https://icrctest.vecnacares.org/openmrs/referenceapplication/home.page");
		Thread.sleep(3000);
		
		
	}

	
}

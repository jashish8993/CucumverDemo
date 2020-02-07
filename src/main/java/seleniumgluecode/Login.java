package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
 WebDriver driver;

	@Given("^user launches the url$")
	public void user_launches_the_url() throws Throwable {
	 System.setProperty("webdriver.gecko.driver", "E://geckodriver.exe");
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
	
}

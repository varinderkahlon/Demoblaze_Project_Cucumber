package signup_Stepdefination_Demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup_Stepdefination_Demoblaze {
	
	WebDriver driver;
	@Given("User must be on home page by clicling url {string}")
	public void user_must_be_on_home_page_by_clicling_url(String string) {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(string);
	}

	@Given("User clicks on Signup Link")
	public void user_clicks_on_signup_link() {
	  driver.findElement(By.id("signin2")).click();
	}

	@Given("Signup Dialog Box should display")
	public void signup_dialog_box_should_display() throws InterruptedException {
	  driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-header")).isDisplayed();
	  Thread.sleep(5000);
	}

	

	/*@When("^User Enter (.*) and (.*) in Signup Form$")
	public void user_enter_username_and_password(String SignUp_username, String SignUp_password) throws InterruptedException {
		  driver.findElement(By.id("sign-username")).sendKeys(SignUp_username);
		  Thread.sleep(5000);
		  driver.findElement(By.id("sign-password")).sendKeys(SignUp_password);
}
*/
	
	@When("User Enter Varinder_Admin_Test and admin123")
	public void user_enter_varinder_admin_test_and_admin123() throws InterruptedException {
		 driver.findElement(By.id("sign-username")).sendKeys("Varinder_Admin_Test");
		  Thread.sleep(5000);
		  driver.findElement(By.id("sign-password")).sendKeys("admin123");
	}

	@When("User clicks on Signup button")
	public void user_clicks_on_signup_button() throws InterruptedException {
	    driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	    Thread.sleep(5000);
	}

	@Then("User clicks on Ok button on Alert window")
	public void user_clicks_on_ok_button_on_alert_window() throws InterruptedException {
	    Alert SignUpButton = driver.switchTo().alert();
	    Thread.sleep(5000);
	    SignUpButton.accept();
	    
	}


}

package login_Stepdefination_Demoblaze;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_Stepdefination_Demoblaze {
	WebDriver driver;
	@Given("User must be on homepage by clicling url {string}")
	public void user_must_be_on_homepage_by_clicling_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);
	}

	@Given("User clicks on Login Link")
	public void user_clicks_on_login_link() {
	   driver.findElement(By.id("login2")).click();
	}

	@Given("Login Dialog Box should display")
	public void login_dialog_box_should_display() throws InterruptedException {
	 driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-header")).isDisplayed();
	 Thread.sleep(5000);
	}

	@When("^User Enter (.*) and (.*) in Login form$")
	public void user_enter_username_and_password_in_login_form(String Login_username, String Login_password) throws InterruptedException {
	   driver.findElement(By.id("loginusername")).sendKeys(Login_username);
	   Thread.sleep(5000);
	   driver.findElement(By.id("loginpassword")).sendKeys("admin123");
	}
	
	@When("User clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
	   driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
	   Thread.sleep(5000);
	}

	@Then("User should be able to Login to Homepage")
	public void user_should_be_able_to_login_to_homepage() {
	boolean HomePage= driver.findElement(By.id("nava")).isDisplayed();
	Assert.assertEquals(true, HomePage);
	}

}

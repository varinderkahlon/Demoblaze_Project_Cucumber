package addtoCart_Stepdefination_Demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class AddToCart_Stepdefination_Demoblaze {
	WebDriver driver;
	
	@Given("User must be on homepage after Login by clicling url {string}")
	public void user_must_be_on_homepage_after_login_by_clicling_url(String string) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
	}

	@Given("User Clicks on Laptop option")
	public void user_clicks_on_laptop_option() throws InterruptedException {
	   driver.findElement(By.xpath("//*[@id=\"itemc\"][2]")).click();
	   Thread.sleep(5000);
	}

	@Given("User selects any Laptop name")
	public void user_selects_any_laptop_name() {
	 
		driver.findElement(By.cssSelector("#tbodyid > div:nth-child(3) > div > div > h4 > a")).click();
	}

	@Given("A new page opens with image of Laptop and ADD TO CART button")
	public void a_new_page_opens_with_image_of_laptop_and_add_to_cart_button() {
	  driver.findElement(By.cssSelector("body > div.product-content.product-wrap.clearfix.product-deatil")).isDisplayed();
	}

	@When("User clicks on ADD TO CART button")
	public void user_clicks_on_add_to_cart_button() throws InterruptedException {
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
	 driver.findElement(By.cssSelector("#tbodyid > div.row > div > a")).click();
	 Thread.sleep(5000);
	}

	@When("User Should be able to Click OK button on Alert window")
	public void user_should_be_able_to_click_ok_button_on_alert_window() throws InterruptedException {
	   Alert alert=driver.switchTo().alert();
	   alert.accept();
	   Thread.sleep(5000);
	}

	@Then("User navigtes back to Cart Page and veryfy that productis added or not")
	public void user_navigtes_back_to_cart_page_and_veryfy_that_productis_added_or_not() throws InterruptedException {
		driver.switchTo().defaultContent();
	    driver.findElement(By.cssSelector("#cartur")).click();
	    driver.switchTo().defaultContent();
	    Thread.sleep(5000);
	  String Product=   driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr/td[2]")).getText();
	  System.out.println(Product);
	  Assert.assertEquals("MacBook air", Product);
	  System.out.println("Test Passed");
	}


}

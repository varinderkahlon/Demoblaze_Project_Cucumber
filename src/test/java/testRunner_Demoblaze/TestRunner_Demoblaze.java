package testRunner_Demoblaze;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\varin\\eclipse-workspace\\Cucumber_Demoblaze\\src\\test\\java\\signup_Demoblaze_feature\\Signup_Demoblaze.feature",
"C:\\Users\\varin\\eclipse-workspace\\Cucumber_Demoblaze\\src\\test\\java\\signin_Demoblaze__feature\\Login_Demoblaze.feature",
"C:\\Users\\varin\\eclipse-workspace\\Cucumber_Demoblaze\\src\\test\\java\\addtoCart_Demoblaze_Feature\\AddToCart_Demoblaze.feature"},
glue= {"stepdefination"},
plugin= {"pretty","json:target/HTMLreports.json"}, monochrome=true, dryRun=true)
public class TestRunner_Demoblaze {
	
	

}

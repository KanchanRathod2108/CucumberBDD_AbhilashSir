package Step_Defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.login_Page_Pom;
import Utility.Cucumber_common_code;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Kite_login_Page extends Cucumber_common_code {
	WebDriver driver=null;
	login_Page_Pom login;
	
	@Before
//before we used as hook here 
	
public void browserSetup() {
		System.out.println("Browser is open");
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Aakash/eclipse-workspace/Cucumber_AbhilashSir_BDD/Driver/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	}
	
	
	
	
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	    driver.manage().window().maximize();
	}
     
//if we have only sernario then no need to use this ^user enters (.*) and (.*)$ we can simply deaclare using username and password
	
	@When("^user enters (.*) and (.*)$") //hi line nehmi same rahil jevha aapan  test data username ani password deu
	
	//this is gherkin language symbol
	//jevha aapan senario outline use karto tevha username he ^username(.*) dyav lagto and password(.*)$ as dyav lagto
	
	
	public void user_enters_username_and_password(String username ,String Password) throws InterruptedException {
		                                         //username ani password he feature file madhun yet ahe 
		login=new  login_Page_Pom(driver);
		                          //es driver ka return type WebDriver hota hai
	
	    login.enter_user_name(username);
	    login.enter_password(Password);
	   
	}

	@And("click on login button")
	public void click_on_login_button()  {
	    
		
		login.enter_submit_button();
	
	}
	

	@Then("user is navigate to homepage")
	public void user_is_navigate_to_homepage() throws InterruptedException {
		
		
		login.enter_logout();
	
	
	
	}	
	@Then("Click on logout button")
	public void Click_on_logout_button() throws InterruptedException {
		
		
		login.enter_logout_button();
	}
	@After //hooks
	public void broswerClose() {
		driver.close();
		driver.quit();
	}
	
}	


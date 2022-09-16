
package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page_Pom {
	
	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement user_name;
	
	@FindBy(id="password")
	private WebElement Password;

	@FindBy(id="submit")
	private WebElement submit;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
    private WebElement logout;
	
	public login_Page_Pom(WebDriver driver) { //static method we dont create object here
		//constructor initalise the data members and allocate the memeory
		
		PageFactory.initElements(driver,this); //constructor create kiya hai
	                 //init is method                   //this keyword indicate this class 
	}
	
	public void enter_user_name(String username) { //username aapan step defination file madhun ghet ahot
		
		user_name.sendKeys(username);
		//user_name is loctor
	}
public void enter_password(String password) {
		
		Password.sendKeys(password);
	}
public void enter_submit_button() {
	
	submit.click();
}
public void enter_logout() throws InterruptedException {
	boolean temp = logout.isDisplayed();
	
	if(temp==true)
	{
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is fail");
	}
	
}
public void enter_logout_button() throws InterruptedException
{
	Thread.sleep(3000);
    logout.click();
}

}

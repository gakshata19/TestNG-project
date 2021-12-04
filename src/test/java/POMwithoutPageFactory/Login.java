package POMwithoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	
	By username=By.xpath("//*[@name='email']");
	
	By password=By.xpath("//input[@name='password']");
	
	By loginbutton=By.xpath("//div[text()='Login']");
	
	Login(WebDriver driver){
		this.driver=driver;
	}
	
	public void Username(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void Password(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void LoginButton() {
		driver.findElement(loginbutton).click();
	}
}

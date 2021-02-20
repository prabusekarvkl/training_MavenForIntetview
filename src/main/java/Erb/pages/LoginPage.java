package Erb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Erb.base.Testbase;

public class LoginPage  extends Testbase{
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email") WebElement username;
	@FindBy(id="password") WebElement pass;
	@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div[2]/form/button") WebElement click;
	
	
	public void txtusername() {
		username.sendKeys("triotend@gmail.com");
		
	}
	public void password() {
		pass.sendKeys("triotend");
	}
	
	public void btnclick() {
		click.click();
		
	}
	
	

}

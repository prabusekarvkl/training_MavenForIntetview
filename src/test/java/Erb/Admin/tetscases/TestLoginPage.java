package Erb.Admin.tetscases;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Erb.base.Testbase;
import Erb.pages.LoginPage;

public class TestLoginPage  extends Testbase{
	
	LoginPage log;
	
	public TestLoginPage()
	{
		super();
	}
	
@BeforeClass
public void browserlaunch() {
	startup();

}
	
@Test
public void login() {
	log= new LoginPage();
	
	log.txtusername();
	log.password();
	log.btnclick();

}
@AfterClass
public void end() {
	close();
}
	
	

}

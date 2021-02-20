package Erb.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testbase {
	public static WebDriver driver;

	public void startup() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/THARUN/eclipse-workspace/training programs/Selenium_class/Driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://triotend.com/tts/site/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);

	}

	public void elementvisible(WebElement e) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(e));

	}
public void close() {
driver.close();
}

}

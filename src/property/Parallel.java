package property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void launch(String browser){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		if(browser.equals("firefox")){
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		}
		
		else
		{
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			
		}
		
	}

}

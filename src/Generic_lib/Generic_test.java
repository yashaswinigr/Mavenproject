package Generic_lib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_test implements Framework_constants{
public WebDriver driver;
	
	@BeforeMethod
	public void openappl() throws InterruptedException
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	     driver = new FirefoxDriver();
	     Thread.sleep(2000);
	    driver.get("https://github.com/login");
	}
	@AfterMethod
	public void closeappl(ITestResult res) throws IOException{
		int status = res.getStatus();
	
		if(status==1 || status==2){
			GenericScreenshot.getphoto(driver);
			
		}
			
	
		driver.quit();
	}

}




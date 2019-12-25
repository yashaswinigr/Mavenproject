package Generic_lib;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic_switch {
	public void win_handles(WebDriver driver)
	{
		
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh){
			driver.switchTo().window(wh);
		}
	}

}



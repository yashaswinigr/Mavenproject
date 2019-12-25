package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GithubHomePage {
	@FindBy(xpath="(//summary[@role='button'])[2]")
	private WebElement logoutclick;
	@FindBy(xpath="//button[@class='dropdown-item dropdown-signout']")
	private WebElement signoutclick;
	
	
	public GithubHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public  void clickdrop(){
		logoutclick.click();
	}
	public  void clicsignout(){
		signoutclick.click();
	}


}

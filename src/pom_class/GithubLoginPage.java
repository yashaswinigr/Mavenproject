package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GithubLoginPage{
	@FindBy(id="login_field")
	private WebElement u;
	@FindBy(id="password")
	private WebElement ptxt;
	@FindBy(name="commit")
	private WebElement lgn;
	
	public GithubLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
public void senduser(String un){
	u.sendKeys(un);
	
}
public void sendpass(String pwd){
	ptxt.sendKeys(pwd);

}
public void clicklogin(){
	lgn.click();
}
}





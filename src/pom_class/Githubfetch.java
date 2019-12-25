package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Githubfetch {
	@FindBy(xpath="(//a[@class='btn btn-sm btn-primary text-white'])[1]")
	private WebElement u;
	@FindBy(xpath="//input[@id='repository_name']")
	private WebElement repname;
	@FindBy(xpath="//button[@class='btn btn-primary first-in-line']")
	private WebElement repcreate;
	@FindBy(xpath="//input[@id='empty-setup-clone-url']")
	private WebElement url;
	@FindBy(xpath="//pre[@id='empty-setup-new-repo-echo']")
	private WebElement txt;
	public Githubfetch(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickrep()
	{
		u.click();
	}
	public void sendrepname(String rename){
		repname.sendKeys(rename);
	}
	public void clickrepcreate()
	{
		repcreate.click();
	}
	public void gettext()
	{
		String s = url.getAttribute("value");
		Reporter.log(s,true);
		
	}
	public void getAlltext()
	{
		String s1 = txt.getText();
		Reporter.log(s1,true);
		
	}

}




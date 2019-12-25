package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GithubRepositoryPage {
	@FindBy(xpath="(//a[@class='btn btn-sm btn-primary text-white'])[1]")
	private WebElement u;
	@FindBy(xpath="//input[@id='repository_name']")
	private WebElement repname;
	@FindBy(xpath="//button[@class='btn btn-primary first-in-line']")
	private WebElement repcreate;
	public GithubRepositoryPage(WebDriver driver) {
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

}

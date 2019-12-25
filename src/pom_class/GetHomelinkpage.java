package pom_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class GetHomelinkpage {
	@FindBy(id="login_field")
	private WebElement u;
	@FindBy(id="password")
	private WebElement ptxt;
	@FindBy(name="commit")
	private WebElement lgn;
	@FindBy(xpath="//a")
	private List<WebElement> links;
	
	
	public GetHomelinkpage(WebDriver driver) {
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

public void getalllinks(){
ArrayList<String> arr = new ArrayList<String>();
	for(WebElement allwh:links){
		String l = allwh.getText();
		arr.add(l);
	}

	Collections.sort(arr);

	for(String txt:arr){
		Reporter.log(txt,true);
	}


	Collections.sort(arr,Collections.reverseOrder());
	

	for(String txt:arr){
		Reporter.log(txt,true);
	}
	}
	
	
}

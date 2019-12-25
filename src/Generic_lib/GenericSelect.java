package Generic_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericSelect {
	  public void selectIndex(WebElement ele,int i){
          Select s = new Select(ele);
		     s.selectByIndex(i);
		}
	       
	       public void selectValue(WebElement ele,String value){
	             Select s = new Select(ele);
			     s.selectByValue(value);
			}
	       
	       public void selectText(WebElement ele,String value){
	             Select s = new Select(ele);
			     s.selectByValue(value);
			}
	       
	       public void deselectbyindex(WebElement ele,int i){
	             Select s = new Select(ele);
			     s.deselectByIndex(i);
			}
	       public void deselectbyvalue(WebElement ele,String value){
	             Select s = new Select(ele);
			     s.deselectByValue(value);
			}
	       public void deselectbyvisiblevalue(WebElement ele,String value){
	             Select s = new Select(ele);
			     s.deselectByVisibleText(value);
			}
	       public void deselectall(WebElement ele){
	             Select s = new Select(ele);
			     s.deselectAll();
			}
}

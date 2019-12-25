package Generic_lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
	public void maximize_action(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void minimize_action(WebDriver driver)
	{
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_N);
	          
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void resize_action(WebDriver driver,int a,int b){
		Dimension d = new Dimension(a,b);
		driver.manage().window().setSize(d);
	}
	
	public void drag_action(WebDriver driver,int a,int b){
		Point p = new Point( a, b);
		driver.manage().window().setPosition(p);
	}
		
	public void close_action(WebDriver driver){
		Robot r;
		try {
			r = new Robot();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_C);
			
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_C);
	          
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}







package Generic_lib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GenericScreenshot {
	public  static void getphoto(WebDriver driver) throws IOException{
		String photo="./photos/";
		Date d=new Date();
		String s =d.toString();
		String s1 = s.replaceAll(":","-");
		  TakesScreenshot ts =(TakesScreenshot)driver;	
	      File src = ts.getScreenshotAs(OutputType.FILE);
	     File dst =new File(photo+s1+".jpeg");
	       FileUtils.copyFile(src,dst);
	}

}

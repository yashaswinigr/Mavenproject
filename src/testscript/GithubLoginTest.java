package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic_lib.Excel;
import Generic_lib.Generic_test;
import pom_class.GithubHomePage;
import pom_class.GithubLoginPage;

public class GithubLoginTest extends Generic_test  {


	
	@Test
	public void testLogin()throws InterruptedException
	{
		GithubLoginPage g = new GithubLoginPage(driver);
		Thread.sleep(2000);
		String un = Excel.getData("sheet1",1, 0);
		g.senduser(un);
		Thread.sleep(2000);
		String pwd = Excel.getData("sheet1", 1, 1);
		Thread.sleep(2000);
		g.sendpass(pwd);
		g.clicklogin();
		Thread.sleep(2000);
		GithubHomePage g1 = new GithubHomePage(driver);
         g1.clickdrop();
         Thread.sleep(2000);
         g1.clicsignout();
}
}


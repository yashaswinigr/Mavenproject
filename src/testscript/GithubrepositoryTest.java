package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom_class.GithubLoginPage;
import pom_class.GithubRepositoryPage;
import Generic_lib.Excel;
import Generic_lib.Generic_test;

public class GithubrepositoryTest extends Generic_test{
	
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
		GithubRepositoryPage g1 = new GithubRepositoryPage(driver);
		g1.clickrep();
		g1.sendrepname("Amazon188");
		Thread.sleep(2000);
		g1.clickrepcreate();
}
}


package testscript;

import org.testng.annotations.Test;

import pom_class.GetHomelinkpage;
import pom_class.GithubHomePage;
import pom_class.GithubLoginPage;
import Generic_lib.Excel;
import Generic_lib.Generic_test;

public class GithubHomelinktest extends Generic_test{
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
		GetHomelinkpage g4 = new GetHomelinkpage(driver);
		g4.getalllinks();
		
}
}



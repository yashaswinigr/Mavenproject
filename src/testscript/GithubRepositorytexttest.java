package testscript;

import org.testng.annotations.Test;

import pom_class.GithubLoginPage;
import pom_class.GithubRepositoryPage;
import pom_class.Githubfetch;
import Generic_lib.Excel;
import Generic_lib.Generic_test;

public class GithubRepositorytexttest extends Generic_test{
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
		g1.sendrepname("Amazon6");
		Thread.sleep(2000);
		g1.clickrepcreate();
		Githubfetch g2 = new Githubfetch(driver);
		g2.gettext();
		g2.getAlltext();
}
}




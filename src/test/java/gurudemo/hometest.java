package gurudemo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import junit.framework.Assert;
import pages.Home;
import pages.Login;
import pages.NewCustomer;
import pages.logout;

public class hometest extends base{
	Home homepage;
	//NewCustomer newcust;
	//logout lgout;
	Login loginpage;
	
	@BeforeMethod
	public void clickonnewcusttest()
	{
		initialize();
		
		
		loginpage=new Login();
		homepage = loginpage.Login();
		
	}
	
		@Test(priority=1)
		public void verifyhomepagetitletest()
		{
			String homepagetitle=homepage.verifyhomepagetitle();
			System.out.println(driver.getTitle());
			Assert.assertTrue(homepagetitle.contains("Manager"));
			
		}
		
		@Test(priority=2)
		public void clickonNewcustlinktest()
		{
			homepage.clickonnewcust();
			
		
		}
	
		@Test(priority=3)
		public void clickonlogoutlinktest()
		{
			homepage.clickonlogout();
			
		}


}

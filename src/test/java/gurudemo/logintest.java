package gurudemo;





import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.base;
import pages.Home;
import pages.Login;

public class logintest extends base{
	
	Login loginpage;
	Home homepage;
	/*public logintest()
	{
		super();
	}*/
	@BeforeMethod
	public void setup()
	{
		initialize();
		 loginpage=new Login();
	}
	
	
/*	@AfterMethod
	public void closedriver()
	{
		driver.quit();
		}
*/	
	
	@Test(priority=1)
	public void verifyLoginpagelabelTest()
	{
		String LoginLabel=loginpage.verifyLoginPageLabel();
		System.out.println("the label at login page is"+ LoginLabel);
		Assert.assertEquals(LoginLabel,prop.getProperty("LoginLabel"));
	}
	
	@Test(priority=2)
	public void LoginTest()
	{
		homepage = loginpage.Login();
		
	}
}

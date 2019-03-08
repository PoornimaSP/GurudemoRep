package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;

public class Home extends base {
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	WebElement newcust;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	WebElement logout;
	
    Home()
    {
    	PageFactory.initElements(driver,this);
    }
    
    public NewCustomer clickonnewcust()
    {
     newcust.click();
     return new NewCustomer();
    }
    
    
    public logout clickonlogout()
    {
     logout.click();
     return new logout();
    }
    
    public String verifyhomepagetitle()
    {
    	return driver.getTitle();
    }
}

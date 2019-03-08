package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;



public class Login extends base{
	
	@FindBy(xpath="//h2[@class='barone']")
	WebElement Loginpagelabel;
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="btnLogin")
	WebElement Loginbutton;
	
	public Login()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public String verifyLoginPageLabel()
	{
		return Loginpagelabel.getText();
	}
	
	public Home Login()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
	 Loginbutton.click();
	 return new Home();
		
		
	}


}

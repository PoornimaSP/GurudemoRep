package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class base {
	public static Properties prop;
	public static WebDriver driver;
	
	public base() 
	{
		try
		{
	prop = new Properties();
	FileInputStream ip= new FileInputStream("C:\\Users\\welcome\\workspace\\MavenFirst\\src\\main\\java\\com\\gurudemo\\config\\config.properties");
    prop.load(ip);
    }
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
		e.printStackTrace();
		}
	
	
	}
	
	public static void initialize()
	{
		String browser = prop.getProperty("browser");
		if (browser.equals("FF"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\uday\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver,gecko,driver","C:\\uday\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			}	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
	}

}

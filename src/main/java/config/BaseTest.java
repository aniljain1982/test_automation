package config;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	public static WebDriver driver;
	public static String browser;
	
	@BeforeTest
	@Parameters({"browser"})
	public void setParameters(String browser){
		this.browser=browser;
	}
	
	public void setBrowser(){
		if(browser.toUpperCase().equals("CHROME")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(browser.toUpperCase().equals("FF")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.toUpperCase().equals("IE")){
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}

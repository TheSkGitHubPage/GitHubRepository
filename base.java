package findelementsproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base {
	
	
	
	 WebDriver driver;
	    @BeforeMethod
	    public void SetupDriver(){

	        System.setProperty("webdriver,chrome,driver","Users/saida/Documents/drivers/chromedriver");
	        driver=new ChromeDriver();
	        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	       // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        //driver.manage().deleteAllCookies();
	      //  driver.get("\"https://disneyworld.disney.go.com/");
	    }
	    
	    String browser = "chrome";

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\webdriver\\geckodriver-v0.33.0-win32\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
	    
		

		
		

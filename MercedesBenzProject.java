package findelementsproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MercedesBenzProject {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	
	public void mercedesBenzTestCase () throws InterruptedException {
		
		driver.get("https://www.bmwusa.com/");
		driver.findElement(By.cssSelector("li[data-flyout=\"build your own\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[class=\"cta-button theme-core byo-core-type series-header-cta cta-1\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class=\"byo-core-type label-1\"]//ancestor::div[@class=\"model-group\"])[1]")).click();
		Thread.sleep(1000);
		
	}

}

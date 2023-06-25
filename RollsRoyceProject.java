package findelementsproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class RollsRoyceProject {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Actions actions = new Actions(driver);
	}

	@Test
	public void Test1() throws InterruptedException {
		driver.get("https://www.rolls-roycemotorcars.com/en_US/home.html");
		// Menu button 
		WebElement menuBtn = driver.findElement(By.cssSelector("span[data-style=\"gradient-black\"]"));
		menuBtn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class=\"rrmc-menu-link-copy\"])[1]")).click();
		Thread.sleep(1000);

		sendKeys(Keys.PAGE_DOWN);
		sendKeys(Keys.PAGE_DOWN);
		menuBtn.click();
		// Models button
		WebElement modelsBtn = driver.findElement(By.cssSelector("button[aria-label=\"Models\"]"));
		modelsBtn.click();
		// Choosing PHantom Extended option
		driver.findElement(By.cssSelector("a[aria-label=\"Phantom Extended\"]")).click();
		
		Thread.sleep(1000);
		

	}

	private Actions sendKeys(Keys pageDown) {
		// TODO Auto-generated method stub
		return null;
	}

}

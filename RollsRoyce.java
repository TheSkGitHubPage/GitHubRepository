package findelementsproject;

import java.util.List;


import org.testng.annotations.Test;


public class RollsRoyce extends base {

	@Test
	public void goToWebsite() {
		driver.get("https://www.rolls-roycemotorcars.com/en_US/home.html");
	}
	
	

	//driver.findElement(By.cssSelector("span[data-style=gradient-black] svg")).sendKeys(Keys.ENTER);
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("a[aria-label=\"Inspiring Greatness\"]")).sendKeys(Keys.ENTER);
//			Thread.sleep(1000);
//			sendKeys(Keys.PAGE_DOWN);
//			driver.findElement(By.cssSelector("button[class='vjs-play-control vjs-control vjs-button vjs-paused']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("button[title=\"Fullscreen\"]>span+span")).click();
//			Thread.sleep(5000);
//			driver.findElement(By.cssSelector("button[title=\"Non-Fullscreen\"]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("div[class='vjs-subs-caps-button vjs-menu-button vjs-menu-button-popup vjs-control vjs-button']>button")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("li[class='vjs-menu-item vjs-subtitles-menu-item vjs-selected']>span")).click();
//			Thread.sleep(1000);
//			sendKeys(Keys.PAGE_DOWN);
//			WebElement element = driver.findElement(By.className("rrmc-cc-carousel-heading"));
//			String text = element.getText();
//			System.out.println(text);
//			Thread.sleep(1000);
//			sendKeys(Keys.PAGE_DOWN);
//			WebElement element2 = driver.findElement(By.xpath("//h4[contains(text(),'GENNADIY GOLOVKIN')]"));
//			String text2 = element2.getText();
//			System.out.println(text2);
//			//div[style='left: 600.848px;'] -- 1:16 of video
//			List<WebElement> elements = driver.findElements(By.xpath("//*[@class='vjs-play-control vjs-control vjs-button vjs-paused']"));
//			if(elements.size() >= 5) {
//				WebElement fifthElement = elements.get(5);
//				fifthElement.click();
//			}
//			driver.findElement(By.xpath("//video-js[@id=\"vjs_video_7090\"]//button[@title='Fullscreen']")).click();
//			driver.findElement(By.cssSelector("div[aria-valuenow=\"35.57\"]")).click();
//			//div[style="width: 35.75%;"] 
//			//div[style='left: 600.848px;'] -- 1:16 of video -- use whichever you can find.
//			Thread.sleep(5000);
//			driver.findElement(By.cssSelector("button[aria-label=\"Phantom\"]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("a[aria-label=\"Phantom Extended\"]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("a[aria-label=\"Spectre\"]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("button[aria-label=\"Cullinan\"]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//span[@data-color=\"#6D30A7\"]/following-sibling::span[text()='DISCOVER'])[1]")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("span[class=\"rrmc-mask-element\"]")); // see SUV RR for Family.
//			Thread.sleep(1000);
//			driver.findElement(By.cssSelector("span[class=\"rrmc-nav-dealer-locator-copy\"]")).click();
//			Thread.sleep(1000);
//			WebElement cityBox = driver.findElement(By.xpath("(//div[starts-with(@class,'rrmc-for')]/label[@for=\"rrmc-dealer-input\"])[1]"));
//			cityBox.sendKeys("New York");
//			Thread.sleep(1000);
//			WebElement countryBox = driver.findElement(By.xpath("(//div[starts-with(@class,'rrmc-for')]/label[@for=\"rrmc-dealer-input\"])[2]"));
//			countryBox.sendKeys("United States");
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[@class=\"rrmc-dealer-locator-header js-rrmc-dealer-locator-header\"]//span[text()='Search']")).click();
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//span[@class=\"rrmc-button-text\"])[1]")).click();
//			Thread.sleep(1000);
//			sendKeys(Keys.DOWN);

	

	// @After

	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();

	}

	public void Test1() throws InterruptedException {
		System.out.println("String test 1");

		// driver.get("https://www.rolls-roycemotorcars.com/en_US/home.html");
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("span[data-style=gradient-black] svg")).sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("a[aria-label=\"Inspiring Greatness\"]")).sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//		sendKeys(Keys.PAGE_DOWN);
//		driver.findElement(By.cssSelector("button[class='vjs-play-control vjs-control vjs-button vjs-paused']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("button[title=\"Fullscreen\"]>span+span")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("button[title=\"Non-Fullscreen\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("div[class='vjs-subs-caps-button vjs-menu-button vjs-menu-button-popup vjs-control vjs-button']>button")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("li[class='vjs-menu-item vjs-subtitles-menu-item vjs-selected']>span")).click();
//		Thread.sleep(1000);
//		sendKeys(Keys.PAGE_DOWN);
//		WebElement element = driver.findElement(By.className("rrmc-cc-carousel-heading"));
//		String text = element.getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//		sendKeys(Keys.PAGE_DOWN);
//		WebElement element2 = driver.findElement(By.xpath("//h4[contains(text(),'GENNADIY GOLOVKIN')]"));
//		String text2 = element2.getText();
//		System.out.println(text2);
//		//div[style='left: 600.848px;'] -- 1:16 of video
//		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='vjs-play-control vjs-control vjs-button vjs-paused']"));
//		if(elements.size() >= 5) {
//			WebElement fifthElement = elements.get(5);
//			fifthElement.click();
//		}
//		driver.findElement(By.xpath("//video-js[@id=\"vjs_video_7090\"]//button[@title='Fullscreen']")).click();
//		driver.findElement(By.cssSelector("div[aria-valuenow=\"35.57\"]")).click();
//		//div[style="width: 35.75%;"] 
//		//div[style='left: 600.848px;'] -- 1:16 of video -- use whichever you can find.
//		Thread.sleep(5000);
//		driver.findElement(By.cssSelector("button[aria-label=\"Phantom\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("a[aria-label=\"Phantom Extended\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("a[aria-label=\"Spectre\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("button[aria-label=\"Cullinan\"]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//span[@data-color=\"#6D30A7\"]/following-sibling::span[text()='DISCOVER'])[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("span[class=\"rrmc-mask-element\"]")); // see SUV RR for Family.
//		Thread.sleep(1000);
//		driver.findElement(By.cssSelector("span[class=\"rrmc-nav-dealer-locator-copy\"]")).click();
//		Thread.sleep(1000);
//		WebElement cityBox = driver.findElement(By.xpath("(//div[starts-with(@class,'rrmc-for')]/label[@for=\"rrmc-dealer-input\"])[1]"));
//		cityBox.sendKeys("New York");
//		Thread.sleep(1000);
//		WebElement countryBox = driver.findElement(By.xpath("(//div[starts-with(@class,'rrmc-for')]/label[@for=\"rrmc-dealer-input\"])[2]"));
//		countryBox.sendKeys("United States");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class=\"rrmc-dealer-locator-header js-rrmc-dealer-locator-header\"]//span[text()='Search']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//span[@class=\"rrmc-button-text\"])[1]")).click();
//		Thread.sleep(1000);
//		sendKeys(Keys.DOWN);

	}

	private Object sendKeys(Keys pageDown) {
		// TODO Auto-generated method stub
		return null;
	}

}

package findelementsproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCases {

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	 //@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	 @Test
	public void test1() throws InterruptedException {
		// 1
		driver.get("https://www.zara.com/us/");
		Thread.sleep(500);
		// 2
		WebElement menuBtn = driver.findElement(By.cssSelector("svg[class=\"layout-header__icon\"]"));
		menuBtn.click();
		Thread.sleep(3000);
		// 3
		WebElement mens = driver.findElement(By.xpath("(//a[@aria-label=\"MAN, Show other categories\"])[1]"));
		mens.click();
		Thread.sleep(2000);
		// 4
		driver.findElement(By.cssSelector("a[aria-label=\"SUITS, Show other categories\"]")).click();
		Thread.sleep(2000);
		// 5
		WebElement formalSuits = driver.findElement(By.xpath("(//a[@class=\"nav-row__item link\"])[1]"));
		formalSuits.click();
		Thread.sleep(2000);
		// 6
		driver.findElement(By.cssSelector("li[data-productid=\"267195649\"]")).click();
		Thread.sleep(2000);
		// 7
		WebElement suitImage = driver
				.findElement(By.xpath("(//button[@class=\"product-detail-images-thumbnails__thumbnail-wrapper\"])[2]"));
		suitImage.click();
		Thread.sleep(2000);
		// 8
		WebElement suitImage2 = driver
				.findElement(By.xpath("(//img[@alt=\"Image 2 of SUIT JACKET IN 100% LINEN from Zara\"])[1]"));
		suitImage.click();
		Thread.sleep(2000);
		// 9
		WebElement selectSizeS = driver
				.findElement(By.cssSelector("li[id=\"product-size-selector-267195649-item-0\"]"));
		selectSizeS.click();
		Thread.sleep(2000);
		// 10
		WebElement findYourSizeBtn = driver
				.findElement(By.cssSelector("button[class=\"product-size-selector-footer__size-recommender\"]"));
		findYourSizeBtn.click();
		Thread.sleep(2000);
		// 11
		WebElement measureInInches = driver
				.findElement(By.xpath("//*[@id=\"uclw_form\"]/div[2]/div/div/div[1]/div/div[3]"));
		measureInInches.click();
		Thread.sleep(2000);
		// 12
		WebElement heightInInFeet = driver
				.findElement(By.xpath("//*[@id=\"uclw_block_height\"]/div[2]/div/div[2]/input[1]"));
		heightInInFeet.sendKeys("5");
		Thread.sleep(2000);
		// 13
		WebElement heightInInches = driver.findElement(By.xpath("//*[@id=\"uclw_height_inch\"]"));
		heightInInches.sendKeys("3");
		Thread.sleep(2000);
		// 14
		WebElement weight = driver.findElement(By.xpath("//*[@id=\"uclw_form_weight_lbs\"]"));
		weight.sendKeys("140");
		Thread.sleep(2000);
		// 15
		WebElement fitPreference = driver.findElement(By.cssSelector("div[data-ref=\"button.perfect\"]"));
		fitPreference.click();
		Thread.sleep(2000);
		// 16
		WebElement findMySizeBtn = driver.findElement(By.cssSelector("button[id=\"uclw_save_info_button\"]"));
		findMySizeBtn.click();
		Thread.sleep(1000);
		// 17
		WebElement addInfoBtn = driver.findElement(By.cssSelector("button[id=\"uclw_body_shape_button\"]"));
		addInfoBtn.click();
		Thread.sleep(2000);
		// 18
		WebElement slcYourFigure = driver.findElement(By.cssSelector("span[id=\"uclw_item_shape_3\"]"));
		slcYourFigure.click();
		Thread.sleep(2000);
		// 19
		WebElement slcYourShape = driver.findElement(By.cssSelector("span[id=\"uclw_item_shape_3\"]"));
		slcYourShape.click();
		Thread.sleep(2000);
		// 20
		WebElement slcYourAge = driver.findElement(By.cssSelector("input[data-ref=\"input\"]"));
		slcYourAge.sendKeys("27");
		Thread.sleep(2000);
		// 21
		WebElement addAgeBtn = driver.findElement(By.cssSelector("button[id=\"uclw_save_info_button\"]"));
		addAgeBtn.click();
		Thread.sleep(3000);
		// 22
		WebElement addSizeSBtn = driver.findElement(By.cssSelector("button[id=\"uclw_cart_button\"]"));
		addSizeSBtn.click();
		Thread.sleep(2000);
		// 23
		WebElement goToHomepageBtn = driver.findElement(By.xpath("(//div[@class=\"zds-button__lines-wrapper\"])[2]"));
		goToHomepageBtn.click();
		Thread.sleep(2000);
		// 24
		WebElement menuBtn2 = driver.findElement(By.cssSelector("button[aria-label=\"Open Menu\"]"));
		menuBtn2.click();
		Thread.sleep(2000);
		// 25
		WebElement shirtsBtn = driver.findElement(By.cssSelector("a[aria-label=\"SHIRTS, Show other categories\"]"));
		shirtsBtn.click();
		Thread.sleep(2000);
		// 26
		WebElement formalBtn = driver.findElement(
				By.xpath("//*[@id=\"theme-app\"]/div/div/header/div[1]/div[2]/section/nav/div/div/ul/li[4]/a"));
		formalBtn.click();
		Thread.sleep(2000);
		// 27
		WebElement chooseBlackShirt = driver.findElement(By.xpath(
				"//*[@id=\"main\"]/article/div[2]/section[1]/ul/li[12]/div/div/div[2]/ul/li[3]/a/div[1]/div/div/img"));
		chooseBlackShirt.click();
		Thread.sleep(2000);
		// 28
		WebElement mySizeBtn = driver
				.findElement(By.cssSelector("button[class=\"product-size-selector-footer__size-recommender\"]"));
		mySizeBtn.click();
		Thread.sleep(2000);
		// 29
		WebElement startOverBtn = driver.findElement(By.cssSelector("div[class=\"uclw_back uclw_startover\"]"));
		startOverBtn.click();
		Thread.sleep(2000);
		// 30
		WebElement measureInInches2 = driver
				.findElement(By.xpath("//*[@id=\"uclw_form\"]/div[2]/div/div/div[1]/div/div[3]"));
		measureInInches2.click();
		Thread.sleep(2000);
		// 31
		WebElement measureInCm = driver
				.findElement(By.xpath("//*[@id=\"uclw_form\"]/div[2]/div/div/div[1]/div/div[2]"));
		measureInCm.click();
		Thread.sleep(2000);
		// 32
		WebElement correctWeight = driver.findElement(By.cssSelector("input[id=\"uclw_form_weight\"]"));
		Thread.sleep(2000);
		correctWeight.clear();
		Thread.sleep(2000);
		correctWeight.sendKeys("72");
		Thread.sleep(2000);
		// 33
		WebElement selectFit = driver.findElement(By.cssSelector("div[data-ref=\"button.perfect\"]"));
		selectFit.click();
		Thread.sleep(2000);
		// 34
		WebElement clickFindMySizeBtn = driver.findElement(By.cssSelector("button[id=\"uclw_save_info_button\"]"));
		clickFindMySizeBtn.click();
		Thread.sleep(2000);
		// 35
		WebElement addSizeMBtn = driver.findElement(By.cssSelector("button[id=\"uclw_cart_button\"]"));
		addSizeMBtn.click();
		Thread.sleep(2000);
		// 36
		WebElement addToCartBtn = driver.findElement(By.xpath("(//div[@class=\"zds-button__lines-wrapper\"])[1]"));
		addToCartBtn.click();
		Thread.sleep(2000);
		// 37
		WebElement goToHomepageBtn3 = driver.findElement(By.xpath("(//div[@class=\"zds-button__lines-wrapper\"])[2]"));
		goToHomepageBtn3.click();
		Thread.sleep(2000);
		// 38
		WebElement menuBtn3 = driver.findElement(By.cssSelector("button[aria-label=\"Open Menu\"]"));
		menuBtn3.click();
		Thread.sleep(2000);
		// 39
		for (int i = 0; i < 3; i++) {
			sendKeys(Keys.PAGE_DOWN);
		}

	}

	// @Test
	public void test2() throws InterruptedException {

		// 40
		driver.get("https://www.zara.com/us/");
		Thread.sleep(3000);
		// 41
		WebElement menuBtn3 = driver.findElement(By.cssSelector("svg[class=\"layout-header__icon\"]"));
		menuBtn3.click();
		Thread.sleep(3000);
		// 42
		WebElement clickManBtn = driver.findElement(By.cssSelector("li[data-categoryid=\"358523\"]"));
		clickManBtn.click();
		Thread.sleep(1000);
		// 43
		// Scroll:
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 2000)");
		// 44
//		WebElement mensShoesBtn = driver
//				.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div/nav/div/ul/li[1]/ul/li[16]/a/span"));
//		mensShoesBtn.click();

	}

	//@Test
	public void pricelineTest3() throws InterruptedException {
		driver.get("https://www.priceline.com/");
		// 45
		WebElement flightsBtn = driver.findElement(By.xpath("//div[text()='Flights']"));
		flightsBtn.click();
		Thread.sleep(1000);
		// 46
		WebElement multidestBtn = driver.findElement(By.xpath("(//div[@class=\"sc-uVWWZ VZizT\"])[2]"));
		multidestBtn.click();
		Thread.sleep(1000);
		// 47 
		WebElement dptFromBox = driver
				.findElement(By.id("flights.0.startLocation-typeahead-downshift-container-input"));
		dptFromBox.sendKeys("New York City");
		Thread.sleep(1000);
		// 48
		WebElement goingtoBox = driver.findElement(By.id("flights.0.endLocation-typeahead-downshift-container-input"));
		goingtoBox.click();
		goingtoBox.sendKeys("Las Vegas");
		Thread.sleep(1000);
		// 49
		WebElement deptCalendar = driver.findElement(By.id("flight-date-range-0"));
		deptCalendar.click();
		Thread.sleep(1000);
		// 50
		WebElement fromDate = driver.findElement(By.cssSelector("div[aria-label=\"July 7, 2023\"]"));
		fromDate.click();
		Thread.sleep(1000);
		// 51
		WebElement addAnotherFlightBtn = driver.findElement(By.id("add-flight-button"));
		addAnotherFlightBtn.click();
		Thread.sleep(1000);
		// 52
		WebElement goingToBox2 = driver.findElement(By.id("flights.1.endLocation-typeahead-downshift-container-input"));
		goingToBox2.sendKeys("Los Angeles");
		goingToBox2.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		// 53
		WebElement departingDate2 = driver.findElement(By.id("flight-date-range-1"));
		departingDate2.click();
		Thread.sleep(1000);
		// 54
		driver.findElement(By.cssSelector("div[data-autobot-element-id=\"DATEPICKER_DAY_20230708\"]")).click();
		Thread.sleep(1000);
		// 55
		WebElement passengersBtn = driver.findElement(By.id("traveler-selection-readonly-input"));
		passengersBtn.click();
		Thread.sleep(1000);
		// 56
		// Add adults
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("traveler-selection-adults-radioPlus-button")).click();
		}
		Thread.sleep(1000);
		// 57
		// Add youths
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("traveler-selection-youths-radioPlus-button")).click();
		}
		Thread.sleep(1000);
		// 58
		// Add children
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("traveler-selection-children-radioPlus-button")).click();
		}
		Thread.sleep(1000);
		// 59
		// Add infant
		driver.findElement(By.id("traveler-selection-infantsonlap-radioPlus-button")).click();
		Thread.sleep(1000);
		// 60
		// Cabin select
		WebElement cabinClassDropdown = driver.findElement(By.id("cabin-class-select"));
		cabinClassDropdown.click();
		Thread.sleep(1000);
		// 61
		Select chooseCabinClass = new Select(driver.findElement(By.id("cabin-class-select")));
		chooseCabinClass.selectByVisibleText("Business");
		Thread.sleep(1000);
		// 62
		WebElement findYourFlightBtn = driver.findElement(By.xpath("//div[text()='Find Your Flight']"));
		findYourFlightBtn.click();

	}

	private void sendKeys(Keys pageDown) {
		// TODO Auto-generated method stub

	}
}

package day3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import util.Base;

class D extends Base {

	static WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	//driver = new HtmlUnitDriver();
		System.setProperty("webdriver.chrome.driver","\\Driver\\chromedriver.exe");
		ChromeOptions op= new  ChromeOptions();
		op.addArguments("--headless");
		op.addArguments("--start-maximized");
		driver=new ChromeDriver(op);
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
		driver.quit();
	}
@Test
	public void test() {
		driver.get("http://seleniumhq.org");
		driver.findElement(By.linkText("Download")).click();
	 assertEquals("Downloads", driver.getTitle());
	assertTrue(driver.findElement(By.linkText("Maven users")).isDisplayed());
		
	}

}

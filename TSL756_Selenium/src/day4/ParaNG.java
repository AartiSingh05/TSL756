package day4;

import org.testng.annotations.Test;

import util.BrowserSetup;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class ParaNG {
	WebDriver driver;
  @Test(dataProvider="dp")
  public void Login(String UN, String PWD) {
	  
	  driver.get("http://127.0.0.1:8080/htmldb");
	  driver.findElement(By.xpath("//*[@id=\"P11_USERNAME\"]")).sendKeys(UN);
	  driver.findElement(By.xpath("//*[@id=\"P11_PASSWORD\"]")).sendKeys(PWD);
	  driver.findElement(By.xpath("//*[@value='Login']")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  driver.findElement(By.partialLinkText("Log")).click();  
	  
  }
  
  @DataProvider
  public Object[][] dp()
  {
	  Object data[][] = new Object[4][2];
	  
	  data[0][0] ="sys";
	  data[0][1] = "Newuser123";
	  data[1][0] ="system";
	  data[1][1] = "Newuser123";
	  data[2][0] ="sysAbc";
	  data[2][1] = "Newuser";
	  data[3][0] ="sjo";
	  data[3][1] = "Newuser123";
	  
	  return data;
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  driver = BrowserSetup.browserStart("Chrome");
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}

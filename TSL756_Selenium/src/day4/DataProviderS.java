package day4;

import org.testng.annotations.Test;

import util.BrowserSetup;
import util.Excel;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class DataProviderS {
	
	
	WebDriver driver;
	  @Test(dataProvider="dp")
	  public void Login(String UN, String PWD) {
		  
		  driver.get("http://127.0.0.1:8080/htmldb");
		  driver.findElement(By.xpath("//*[@id=\"P11_USERNAME\"]")).sendKeys(UN);
		  driver.findElement(By.xpath("//*[@id=\"P11_PASSWORD\"]")).sendKeys(PWD);
		  driver.findElement(By.xpath("//*[@value='Login']")).click();
		  driver.findElement(By.cssSelector("img[title='Logout']")).click();
		  driver.findElement(By.partialLinkText("Log")).click();  
		  
	  }
	  
	  @DataProvider
	  public Object[][] dp()
	  {
		  Object data[][] = new Object[5][2];
		  
	Excel excel = new Excel("C:\\Users\\vshadmin\\Desktop\\Book3.xlsx");
	
	for(int i=0;i<=excel.rowCount("Sheet1");i++) {
		data[i][0]=excel.Read("Sheet1",i , 0);

		data[i][1]=excel.Read("Sheet1",i , 1);
	}
		  return data;
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = BrowserSetup.browserStart("Chrome");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}

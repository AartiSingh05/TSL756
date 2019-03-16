package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Base;

public class dependsExample extends Base {
  @Test
  public void f1() {
	  System.out.println("in test 1");
	  driver.get("http://google.com");
	  Assert.assertEquals(driver.getTitle(),"Google");
  }
  @Test(dependsOnMethods="f1")
public void f2()
  {
	  boolean display = driver.findElement(By.name("q")).isDisplayed();
	  System.out.println("in test2");
	  Assert.assertTrue(display);
	  
  }
  
  @Test(dependsOnMethods="f2")
  public void f3()
  {
	  System.out.println("in test 3");
	String data="MODI";
	driver.findElement(By.name("q")).sendKeys(data);
//	new WebDriverWait(driver, 20).
	//until(ExpectedConditions.elementToBeClickable(By.name("btnK")));
	driver.findElement(By.name("btnK")).click();
	Assert.assertEquals(driver.getTitle(), data +" - Google Search");
	  
  }
}

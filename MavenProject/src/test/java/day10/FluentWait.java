package day10;

import org.testng.annotations.Test;

import com.google.common.base.Function;

import util.Base2;
import org.openqa.selenium.support.ui.Wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.WebElement;

public class FluentWait extends Base2{
  
@Test
  public void f()
  {
	  driver.get("http://google.com");
	  
	/*  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(10, TimeUnit.SECONDS)
			    .pollingEvery(5, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class)
			    .ignoring(StaleElementReferenceException.class);

			WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.name("q"));
			}
			});
			
		foo.sendKeys("abc");*/
  }
}

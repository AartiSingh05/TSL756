package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import util.Base;



public class Scrolling  extends Base{
  @Test
  public void f() throws Exception {
//	  TakesScreenshot t =(TakesScreenshot)driver;
JavascriptExecutor js = (JavascriptExecutor)driver;
driver.get("http://seleniumhq.org");
Thread.sleep(2000);

//For scrolling to particular element
js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.linkText("Selenium blog")));
  Thread.sleep(2000);

  
  //js.executeScript(“window.scrollBy(x-pixels,y-pixels)”);
  js.executeScript("window.scrollBy(0,-150)");//For scrolling pixel by pixel
  Thread.sleep(2000);
  
  //js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
  js.executeScript("window.scrollBy(0, document.body.scrollHeight)");//For scrolling at bottom of page
  Thread.sleep(2000);
  
  
//js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
  js.executeScript("window.scrollBy(0, -document.body.scrollHeight)"); //For scrolling up of page
  Thread.sleep(2000);
  
  
  }
}

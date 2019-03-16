package oraclepages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import util.Base2;

public class CheckingLinks extends Base2

{
//	WebDriver driver;
  @Test
  public void f() throws Exception 
  {
	  driver.get("http://newtours.demoaut.com/");
	  List<WebElement>  all=driver.findElements(By.xpath("//a"));
	   
	  for(int i=0;i<all.size();i++)
	  {
		  all=driver.findElements(By.xpath("//a"));
	
  	  all.get(i).click();
	  Thread.sleep(2000);
	  driver.navigate().back();
  }
}
}

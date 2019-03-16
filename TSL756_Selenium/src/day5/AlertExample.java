package day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import util.Base;

public class AlertExample extends Base
{
  @Test
  public void alertTest() throws Exception{
	  driver.get("http://www.magneticautomation.in/2019/01/alert-example.html");
	  driver.findElement(By.xpath("//button[@onclick='myFunction1()']")).click();
	  Alert A = driver.switchTo().alert();
	  String txt = A.getText();
	  System.out.println(txt);
	  Thread.sleep(5000);
	  A.accept();
	  Thread.sleep(2000);
			  
	  driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
	  Alert A2 =driver.switchTo().alert();
	  String txt1 = A2.getText();
	  System.out.println(txt1);
	  Thread.sleep(2000);
	  A2.sendKeys("JOHN");
	
	  
	  Thread.sleep(2000);
	  A2.accept();
	//A2.dismiss();  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
  }
}

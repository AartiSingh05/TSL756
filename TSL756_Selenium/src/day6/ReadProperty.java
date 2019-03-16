package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import util.Base2;
import util.BrowserSetup;

@Test
public class ReadProperty extends Base2 {
  public void Read() throws Exception {
	  
	  Properties prop = new Properties();
	  prop.load(new FileInputStream(".\\file.property"));
	  
	//  WebDriver driver = BrowserSetup.browserStart("chrome");
	  driver.get(prop.getProperty("URL"));
	  
	  driver.findElement(element(prop.getProperty("e_download"))).click();
  }
  
  public By element(String Value)
  {
	  By B=null;
	  if(Value.endsWith("_linktext"))
	  {
		  B=By.linkText(Value.split("_")[0]);
	  System.out.println("B1:" +B);
	  }
	  else if(Value.endsWith("_xpath"))
		  {
		  B=By.xpath(Value.split("_")[0]);
		  System.out.println("B2: " +B);
		  }
	return B;
  }
  
}

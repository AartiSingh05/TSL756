package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import util.Base2;

public class LinkCheck {

	private WebDriver driver;
	LinkCheck(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(tagName = "a") List<WebElement> ls;
	 
	 
	  public void checkLink()
	  {
		   
		  for(int i=0;i<ls.size();i++)
		  {
			 ls.get(i).click();
	  	  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.navigate().back();
	  }
	}
	}


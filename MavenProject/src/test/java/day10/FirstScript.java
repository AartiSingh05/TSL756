package day10;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import util.Base2;
import util.BrowserSetup;


public class FirstScript extends Base2 {
  @Test
  public void TitleTest() throws Exception{
	  
	  ExtentHtmlReporter htmlreport=new ExtentHtmlReporter("Google.html");
	  htmlreport.setAppendExisting(true);
	  
	  ExtentReports ex = new ExtentReports();
	  ex.attachReporter(htmlreport);
	  
	  ExtentTest test =ex.createTest("TitleTest");
	  test.info("Opening URL");
	  driver.get("http://google.com");
	  test.info("Checking Test");
	  
	  //driver.get("http://google.com");
	  Assert.assertEquals(driver.getTitle(), "Google");
	  BrowserSetup.getScreenShot("title");
	  test.pass("Title Test Pass");
	  ex.flush();
	  
  }
}

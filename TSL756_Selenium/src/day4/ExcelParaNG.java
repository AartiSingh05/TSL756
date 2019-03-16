package day4;

import org.testng.annotations.Test;

import jdbcconn.MyConnection;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import util.BrowserSetup;
import util.Excel;

public class ExcelParaNG  {
	WebDriver driver;
	Connection C;
	PreparedStatement stmt;
	
		@Test(dataProvider="dp")

			public void f(String UN, String PWD) throws Exception 
		  {
				driver.get("http://127.0.0.1:8080/htmldb");
				driver.findElement(By.xpath("//*[@type='text']")).sendKeys(UN);
				driver.findElement(By.xpath("//*[@type='password']")).sendKeys(PWD);
				driver.findElement(By.xpath("//*[@value='Login']")).click();
				
				stmt = C.prepareStatement("Update login set status=?where UN=? and PWD=?");
				stmt.setString(2, UN);
				stmt.setString(3, PWD);
				
				/*if(driver.getTitle().equals("Oracle"))
					C.createStatement().executeUpdate("Update Book1 set status='Pass' where UN='"+UN+"'");
				else
					C.createStatement().executeUpdate("Update Book1 set status ='fail'where UN='"+UN+"'");*/
					
				driver.findElement(By.linkText("Logout")).click();
				driver.findElement(By.partialLinkText("Log")).click();
		  }
 @DataProvider
  public Object[][] dp() throws Exception
  {
	  
	  DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
	  C =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","abc","abc");
		ResultSet R2=C.createStatement().executeQuery("select count(*)from Book1");
		R2.next();
		Object data [][] = new Object[R2.getInt(1)][2];
		int i=0;
		ResultSet R = C.createStatement().executeQuery("Select * from Book1");
		
			while(R.next())
			{
				data[i][0]=R.getString(1);
				data[i][1]=R.getString(2);
				i++;
		}
	return data;
}
 @AfterMethod () //Runs for each Test methods
  public void AfterMethod(ITestResult result)
  {
	  try {
		if(result.getStatus()==ITestResult.FAILURE)
		  {
			  System.out.println("Taking ScreenShot");
			  BrowserSetup.getScreenShot(result.getName());
		 	  	stmt.setString(1, "Fail");
		  }
		  else
		{
				stmt.setString(1, "Pass");
		}
		  stmt.executeUpdate();
	} catch (SQLException e) {

		e.printStackTrace();
	}
  }
 @BeforeTest
  public void beforeTest()
  {
	  driver=BrowserSetup.browserStart("chrome");
  }

  @AfterTest
  public void afterTest()
  {
	  driver.quit();
  }
}

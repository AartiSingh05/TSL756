package day5;

import org.testng.annotations.Test;

import util.Base;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class OracleCookie extends Base {
	@Test
	  public void Oracle() throws InterruptedException {
		  
		driver.get("http://127.0.0.1:8080/htmldb");   
		{
		
			driver.findElement(By.cssSelector("input#P11_USERNAME")).clear();
			
			driver.findElement(By.cssSelector("input#P11_USERNAME")).sendKeys("sys");
			
			driver.findElement(By.cssSelector("input[type = 'password']")).clear();
		
			driver.findElement(By.cssSelector("input[type = 'password']")).sendKeys("Newuser123");
		
			driver.findElement(By.cssSelector("input[value='Login']")).click();
			
			System.out.println("LOGGEG in");
			 Set<Cookie> allCookies =driver.manage().getCookies();
			 for(Cookie C : allCookies) {
				 
				 System.out.println("Cookie Name is: " +C.getName());
				 System.out.println("\nCookie Domain is: " +C.getDomain());
				 System.out.println("\nCookie Expiry is: " +C.getExpiry());
				 System.out.println("\nCookie Path is: " +C.getPath());
				 System.out.println("\nCookie Value is: " +C.getValue());
				 System.out.println("\nCookie toString is: " +C.toString());
				 System.out.println("\nCookie Class is: " +C.getClass());
			 }	
			Thread.sleep(4000);
		
			
			driver.manage().deleteAllCookies();
			
			System.out.println("Cookies deleted");
			driver.navigate().refresh();
			
			System.out.println("Logged out");
			 Set<Cookie> allCookies1 =driver.manage().getCookies();
			 for(Cookie C : allCookies1) {
				 
				 System.out.println("Cookie Name is: " +C.getName());
				 System.out.println("\nCookie Domain is: " +C.getDomain());
				 System.out.println("\nCookie Expiry is: " +C.getExpiry());
				 System.out.println("\nCookie Path is: " +C.getPath());
				 System.out.println("\nCookie Value is: " +C.getValue());
				 System.out.println("\nCookie toString is: " +C.toString());
				 System.out.println("\nCookie Class is: " +C.getClass());
			 }	
			Assert.assertEquals(driver.getTitle(), "HTML DB Login");
		
			
		Thread.sleep(4000);
			

		}
	}}
		
		
			/* @Test
			  public void Google() {
				  
				driver.get("http://google.com");  
				 Set<Cookie> allCookies =driver.manage().getCookies();
				 for(Cookie C : allCookies) {
					 
					 System.out.println("Cookie Name is: " +C.getName());
					 System.out.println("\nCookie Domain is: " +C.getDomain());
					 System.out.println("\nCookie Expiry is: " +C.getExpiry());
					 System.out.println("\nCookie Path is: " +C.getPath());
					 System.out.println("\nCookie Value is: " +C.getValue());
					 System.out.println("\nCookie toString is: " +C.toString());
					 System.out.println("\nCookie Class is: " +C.getClass());
				 }	
			//	 for(Cookie C : allCookies1) {
					 driver.manage().deleteAllCookies();
					 {
						 System.out.println("Deleted cookiessssssssssssss");
					 Set<Cookie> allCookies1 =driver.manage().getCookies();
					 for(Cookie C : allCookies1) {
						 
						 System.out.println("Cookie Name is: " +C.getName());
						 System.out.println("\nCookie Domain is: " +C.getDomain());
						 System.out.println("\nCookie Expiry is: " +C.getExpiry());
						 System.out.println("\nCookie Path is: " +C.getPath());
						 System.out.println("\nCookie Value is: " +C.getValue());
						 System.out.println("\nCookie toString is: " +C.toString());
						 System.out.println("\nCookie Class is: " +C.getClass());
					 }	
					
				 }

			 */
	

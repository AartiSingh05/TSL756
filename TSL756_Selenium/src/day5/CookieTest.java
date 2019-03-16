package day5;

import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import util.Base;
public class CookieTest extends Base {
  
	@Test
  public void Google() {
	  
	driver.get("http://google.com");  
	 Set<Cookie> allCookies = driver.manage().getCookies();
	 for(Cookie C : allCookies) { 
		 
		 System.out.println("Cookie Name is: " +C.getName());
		 System.out.println("\nCookie Domain is: " +C.getDomain());
		 System.out.println("\nCookie Expiry is: " +C.getExpiry());
		 System.out.println("\nCookie Path is: " +C.getPath());
		 System.out.println("\nCookie Value is: " +C.getValue());
		 System.out.println("\nCookie toString is: " +C.toString());
		 System.out.println("\nCookie Class is: " +C.getClass());
		 
	 }
  }
}

package day7;

import org.testng.annotations.Test;

import util.Base2;

public class Execute extends Base2 {
  @Test
  public void f() {
	  
	  LoginFactory login = new LoginFactory(driver);
	  driver.get("http://127.0.0.1:8080/htmldb");
	  login.LoginProcess("abc", "abc");
	  
  }
  
  @Test
  public void LinkTest() {
	  
	  LinkCheck link = new LinkCheck(driver);
	  driver.get("http://newtours.demoaut.com/");
	  link.checkLink();
  }
}

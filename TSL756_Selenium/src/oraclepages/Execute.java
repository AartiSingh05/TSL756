package oraclepages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.Base2;

public class Execute extends Base2 {
  @Test
  public void f() throws Exception {
  
	  Login login = new Login(driver);
	  SQL_Commands command = new SQL_Commands(driver);
	  driver.get("http://127.0.0.1:8080/htmldb");
	  login.LoginProcess("abc",  "abc");
	  //WriteCommand write=new WriteCommand(driver);
	  command.WriteCommand();
	  command.dropDown();
	  Thread.sleep(4000);
	  command.logoutProcess();
	  Thread.sleep(4000);
  }
  
/*  @Test(dependsOnMethods="Login")
  public void RunQueryTest()
  {
	  SQL_Commands command = new SQL_Commands(driver);
	  command.getClass();
	  Assert.assertTrue(driver.findElement(By.xpath("//*[text()='TNAME']")));
	  command.logoutProcess();
	  
  }*/
}

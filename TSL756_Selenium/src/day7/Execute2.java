package day7;

import org.testng.annotations.Test;

import util.Base2;
import util.KeyWords;

public class Execute2 extends Base2 {
  @Test
  public void f() {
KeyWords Key=new KeyWords(driver);
Key.openUrl("https://opensource-demo.orangehrmlive.com/");
Key.type("txtUsername_:name", "admin" );
Key.type("txtPassword_:id", "admin123" );
Key.click("//*[@type='submit']_:xpath");
Key.click("//*[@id='welcome']_:xpath");
Key.click("Logout_:linktext");
	  
	  
  }
  
}

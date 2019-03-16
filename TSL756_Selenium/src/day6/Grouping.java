package day6;

import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;

/*
 * If you want to run selective test cases i.e only smoek testing 
 * or regression or Module vise
 */
public class Grouping {
	
	@Test(groups = "smoke")
  public void f1() {
  
	  System.out.println("Smoke test");
  }
  
  @Test(groups = {"smoke" , "regression"} )
  public void f2() {
  
	  System.out.println("Smoke+Regression");
  }
  
  @Test(groups = "regression")
  public void f3() {
  
	  System.out.println("Regression test");
  }
  
  @Test(groups = {"smoke" , "engine" , "regression"})
  public void f4()
  {
	  System.out.println("Smoke+Engine+Regression");
  }
}

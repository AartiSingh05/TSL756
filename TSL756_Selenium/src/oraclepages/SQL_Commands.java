package oraclepages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SQL_Commands {

	private WebDriver driver;
	
	public SQL_Commands( WebDriver driver) {
	
		this.driver=driver;
	}
	
	private By e_logout=By.linkText("Logout");
	private By e_sql = By.linkText("SQL");
	private By e_drop = By.id("P1003_ROWS");
	private By e_sql1 = By.linkText("SQL Commands");
	private By e_sqlTextArea = By.id("P1003_SQL_COMMAND1");
	private By runbtn = By.cssSelector("input[value='Run']");
	
	
	public void WriteCommand()
	{
		driver.findElement(e_sql).click();
		driver.findElement(e_sql1).click();
		driver.findElement(e_sqlTextArea).sendKeys("select * from Book1");
		driver.findElement(runbtn).click();
	
	}
	
	public void dropDown() {
		//driver.findElement(e_drop).click();
		Select select=new Select(driver.findElement(e_drop));
		select.selectByVisibleText("20");
	
	}
	public void logoutProcess()
	{
		driver.findElement(e_logout).click();
	}
}

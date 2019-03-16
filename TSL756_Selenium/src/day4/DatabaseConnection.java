package day4;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class DatabaseConnection {
  @Test
  public void f() throws Exception 
  {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection C  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "abc", "abc");
		
		ResultSet R=C.createStatement().executeQuery("select * from Book1");
		while(R.next())
		{System.out.println(R.getString(1));
		System.out.println(R.getString(2));
		}
  }
}
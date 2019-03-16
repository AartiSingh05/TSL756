package day10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class CSVRead {
  @Test
  public void f() throws Exception {
	  
	  CSVReader reader = new CSVReader(new FileReader(".\\data.csv"));
	  
	  List<String[]> allData = reader.readAll();
	  
	  for(String rowData[] : allData) {
		  for(String ColData:rowData)
		  {
			  System.out.println(ColData);
			  
		  }
		  
//		  System.out.println(rowData[0]);
//		  System.out.println(rowData[1]);
//		  System.out.println(rowData[2]);
//		  
	//Manu	  
	  }
  }
}

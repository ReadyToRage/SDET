package DataDrivenusingApachePOI;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDrivenTesting {

	static FileInputStream FileInput;
	static XSSFWorkbook WorkBook;
	static XSSFSheet Sheet;
	static XSSFRow Rows;
	static XSSFCell cells;

	public static void main(String[] args) throws IOException {

		// data driven testing using apache poi

		ReadData_usingMethod2();
	} 

	public static void ReadFile() throws IOException {		
		FileInput = new FileInputStream(".\\src\\test\\resources\\DataDrivenTesting.xlsx");
		WorkBook = new XSSFWorkbook(FileInput);
		Sheet = WorkBook.getSheet("DDT");		
	}

	public static Object[][] ReadData_usingMethod1() throws IOException{

		ReadFile();

		int NumberOfRows = Sheet.getPhysicalNumberOfRows();

		int NumberOfCoulmns = Sheet.getRow(0).getLastCellNum();

		System.out.println("Rows :"+NumberOfRows);

		System.out.println("Columns :"+NumberOfCoulmns);

		Object[][] data = new Object[NumberOfRows-1][NumberOfCoulmns];

		for(int i=1;i<NumberOfRows;i++) {

			Rows =  Sheet.getRow(i);

			for(int j=0;j<NumberOfCoulmns;j++) {

				cells = Rows.getCell(j);

				data[i-1][j] = cells.toString();

				System.out.print(data[i-1][j]+"|");

			}	

			System.out.println();
		}

		return data;		
	}
    @Test
	public static Object[][] ReadData_usingMethod2() throws IOException{

		ReadFile();

		int NumberOfRows = Sheet.getPhysicalNumberOfRows();

		int NumberOfCoulmns = Sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[NumberOfRows][NumberOfCoulmns];

		Rows:for(int i=0;i<NumberOfRows;i++) {

			Rows =  Sheet.getRow(i);
			
			DataFormatter Dataformat = new DataFormatter();

			Columns:for(int j=0;j<NumberOfCoulmns;j++) {

				cells = Rows.getCell(j);
				
				data[i][j] = Dataformat.formatCellValue(cells);

				System.out.print(data[i][j]+"|");

			}	
  
			System.out.println();
		}

		return data;		
	}



}

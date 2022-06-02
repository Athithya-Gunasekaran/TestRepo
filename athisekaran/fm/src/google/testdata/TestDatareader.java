package google.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class TestDatareader {

	public static void main(String[] args) throws IOException {
		System.out.println(" step1");
		FileInputStream file= new FileInputStream("C:\\Users\\rajekra.000\\workspace\\athisekaran\\src\\google\\testdata\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Dataset1");
		
		XSSFCell cellvalue=sheet.getRow(0).getCell(1);
		System.out.println(cellvalue);
		
		
	/*int rowcount=sheet.getLastRowNum();
		int columncount=sheet.getRow(0).getLastCellNum();
		System.out.println(" Step 2");
		for(int i=1;i<rowcount;i++){
			XSSFRow currentrow= sheet.getRow(i);
			for(int j=0;j<columncount;j++)
			{*/
				//String cellvalue=currentrow.getCell(j).toString();
			System.out.print("  " +cellvalue);
			System.out.println();
			
		}
		

	//}

}
//}
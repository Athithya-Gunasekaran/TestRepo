package google.testdata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;


public class TestDataWriter {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream("C:\\Users\\rajekra.000\\workspace\\athisekaran\\src\\google\\testdata\\Book1.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Dataset1");
		for(int i=0;i<=5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			for(int j=0;j<=5;j++)
			{
				row.createCell(j).setCellValue("abcdf");
			}
			
			}
		workbook.write(file);
             file.close();
             System.out.println("Datas are written in the Excel Sucessfully");
	}

}

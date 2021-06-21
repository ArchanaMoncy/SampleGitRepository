package ExcelData;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{
	
		public static void main(String[] args)
		{
			getRowCount();
			
		}
		public static void getRowCount()
		{
		try
		{
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Moncy Archana\\eclipse-workspace\\Sample\\exceldata\\Input.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.print(rowcount);
		}
		catch(Exception e)
		{
			System.out.print(e.getMessage());
		}
	}
}

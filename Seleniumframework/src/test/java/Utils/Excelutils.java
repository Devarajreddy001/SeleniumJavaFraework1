package Utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {
	
	static String projectpath= System.getProperty("user.dir");
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public Excelutils(String excelPath, String sheetName) 
	{
		try {
		projectpath= System.getProperty("user.dir");
		 workbook= new XSSFWorkbook(excelPath);
		 sheet= workbook.getSheet(sheetName);
	}
		catch(Exception e){
			
		}
	}
	public static void main(String[] args) 
		// TODO Auto-generated method stub
		getRowCount();
		getcelldataString(0, 0);
		getcelldatanumber(1,1);

	}
	
	public static int getRowCount() {
		int rowCount=0;
		try {
		
	 rowCount= sheet.getPhysicalNumberOfRows();
		System.out.println("number of rows : "+ rowCount);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
			
			
		}
		
		return rowCount;
	}
	
	public static int getcolCount() {
		int colCount=0;
		try {
		
	 colCount= sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(colCount);
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
			
		}
		return colCount;
	}
		public static String getcelldataString(int rowNum, int colNum) {
			
			String cellData= null;
			try {
			 cellData= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(cellData);
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				
				
			}
			return cellData;
	}
		
	public static void getcelldatanumber(int rowNum, int colNum) {
			
			try {
			
			double cellData= sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
				
				
			}
	}
}

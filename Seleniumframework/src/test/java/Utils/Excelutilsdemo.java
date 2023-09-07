package Utils;

public class Excelutilsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectpath= System.getProperty("user.dir");
		Excelutils excel= new Excelutils(projectpath +"/excel/data.xlsx","sheet1");
		excel.getRowCount();
		excel.getcelldataString();
		
		
		
	}

}

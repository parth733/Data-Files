
public class Read_write_XLSFile {

	// To read from Excel file always use "apache.poi file"
	
	public static void main(String[] args) {
		
		Xls_Reader d = new Xls_Reader("C:\\Selenium_Jars\\NikulTest.xlsx");
		
		System.out.println(d.getCellData("Data1", "Name", 7));
		
		System.out.println(d.getRowCount("Data1"));
		
		System.out.println(d.getCellData("Data1", 2, 1));
		
		d.setCellData("Data1", "Name", 10, "afsgsh");
	
		
	}

}

package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenDemo2 {
	
	static FileInputStream fis;
	static XSSFWorkbook sheet;
	public DataDrivenDemo2(String loc) throws IOException {
		File f=new File(loc);
		System.out.println(f.exists());
		fis= new FileInputStream(f);
		sheet= new XSSFWorkbook(fis);
		}

	public String getData(int value, int row, int col) {
		XSSFSheet data=sheet.getSheetAt(value);
		String s=	data.getRow(row).getCell(col).getStringCellValue();
		return s;
	}
	
	public int row(int sno) {
		int r=sheet.getSheetAt(sno).getLastRowNum();
		r=r+1;
		return r;
	}
	public static void main(String[] args) throws IOException {
		DataDrivenDemo2 obj= new DataDrivenDemo2("C:\\Users\\akshatag\\Desktop\\Automation\\demoexcel.xlsx");
		System.out.println(obj.getData(0,0,1));
		int rowcount=obj.row(0);
		for(int i=0;i<rowcount;i++) {
			String username=obj.getData(0,i,0);
			String password=obj.getData(0,i,1);
			System.out.println(username + " " +password);
		}
	}

}

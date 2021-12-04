package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\akshatag\\Desktop\\Automation\\demoexcel.xlsx");
		boolean ex=f.exists();
		System.out.println(ex);
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook s= new XSSFWorkbook(fis);
		XSSFSheet xs=s.getSheetAt(0);
		String a=xs.getRow(3).getCell(1).getStringCellValue();
		System.out.println(a);
		int b=xs.getLastRowNum();
		System.out.println(b);
	}

}

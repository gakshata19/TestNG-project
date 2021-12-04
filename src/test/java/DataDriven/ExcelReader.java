package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public FileInputStream fis;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	
	public  ExcelReader(String excelpath) throws IOException{
		File f=new File(excelpath);
		try {
		fis= new FileInputStream(f);
		wb= new XSSFWorkbook(fis);
	}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getdata(int sheetno, int row, int col) {
		sheet=wb.getSheetAt(sheetno);
		String sdata=sheet.getRow(row).getCell(col).getStringCellValue();
		return sdata;
	}
	
	public int rowcount(int sheetno) {
		int rcount=wb.getSheetAt(sheetno).getLastRowNum();
		rcount=rcount+1;
		return rcount;
	}
}

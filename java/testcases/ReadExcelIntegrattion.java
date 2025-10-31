package testcases;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIntegrattion {

	public static String[][] database() throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		
	
		
		short lastCellNum = ws.getRow(lastRowNum).getLastCellNum();
		System.out.println(lastCellNum);
		
		String[][] data=new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum; i++) {
			for (int j = 0; j <lastCellNum; j++) {
				String cv = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=cv;
			  // System.out.println(cv);
			}
			
			
		}
		wb.close();
		return data;
	
	}

}

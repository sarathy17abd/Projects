package testcases;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CommonExcelIntegration {

	public static String[][] database(String excelfilename) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("./data/"+excelfilename+".xlsx");
		
		XSSFSheet ws = wb.getSheetAt(0);
		
		int lastRowNum = ws.getLastRowNum();
		System.out.println(lastRowNum);
		
		//String sv = ws.getRow(1).getCell(2).getStringCellValue();
		//System.out.println(sv);
		
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

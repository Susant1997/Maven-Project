package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class BaseClass1 {

	public static String excelRead(int rowNo, int cellNo) throws Exception {
		
		String value = null;
		
		File f = new File("C:\\Users\\susan\\eclipse-workspace\\TestMaven\\data\\Data1.xlsx");

		FileInputStream fi = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fi);

		Sheet sh = wb.getSheet("Sheet1");

		Row r = sh.getRow(rowNo);

		Cell c = r.getCell(cellNo);
		
		int cellType = c.getCellType();
		
		if (cellType==1) {
			value = c.getStringCellValue();
			
		}
		
		if (cellType==0) {
			
			if (DateUtil.isCellDateFormatted(c)) {
                Date date = c.getDateCellValue();
                SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                value = dateformat.format(date);
            } else {
                double d = c.getNumericCellValue();
                long l = (long) d;
                value = String.valueOf(l);
            }
			
			
		}
		
//		CellType cellType = c.getCellType(); // Use getCellTypeEnum() instead of getCellType()
//
//	        if (cellType == CellType.STRING) { // Use CellType.STRING instead of 1
//	            value = c.getStringCellValue();
//	        }
//
//	        if (cellType == CellType.NUMERIC) { // Use CellType.NUMERIC instead of 0
//	            if (DateUtil.isCellDateFormatted(c)) {
//	                Date date = c.getDateCellValue();
//	                SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
//	                value = dateformat.format(date);
//	            } else {
//	                double d = c.getNumericCellValue();
//	                long l = (long) d;
//	                value = String.valueOf(l);
//	            }
//	        }
		
		
//		int numberOfRows = sh.getPhysicalNumberOfRows();
//
//		System.out.println(numberOfRows);
//		
//		int numberOfCells = r.getPhysicalNumberOfCells();
//
//		System.out.println("Number of cells -"+numberOfCells);
		return value;

	}

}

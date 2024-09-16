package com.tp.scm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this utility is created to perform actions using excel sheet such as fetching
 * data and reading back to excel sheet
 * 
 * @author MINIT SINGH
 */
public class ExcelUtility {

	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String data
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * 
	 */
	public String getDataFromExcel(String sheetName, int rowNum, int cellNum)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./TestData/TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return data;
	}

	/**
	 * method to fetch the total rows present in an excel sheet
	 * 
	 * @param sheetName
	 * @return rowCount
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheetName).getLastRowNum();
		return rowCount;
	}

	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param celNum
	 * @param data
	 * @return void
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public void setDataIntoExcel(String sheetName, int rowNum, int cellNum, String data)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./testData/testScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(rowNum).createCell(cellNum);

		FileOutputStream fos = new FileOutputStream("./testData/testScriptData.xlsx");
		wb.write(fos);
		wb.close();
	}

}

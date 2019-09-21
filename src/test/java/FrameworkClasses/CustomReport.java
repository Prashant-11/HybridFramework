package FrameworkClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomReport implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**Inside listner**");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		WritetoReport("Fail");
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		WritetoReport("Fail");
		
		
	}
	
	public void WritetoReport(String status)
	{
		TestEngine obj_TE = new TestEngine();
		try {
			FileInputStream file = new FileInputStream(new File("./Resources/Read_Write.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet sheet = wb.getSheetAt(0);
			int Last = sheet.getLastRowNum();
			int noofcol = sheet.getRow(0).getLastCellNum();
			sheet.getRow(obj_TE.RowSetter).getCell(noofcol-1).setCellValue(status);
			file.close();
			FileOutputStream outFile = null;
			try
			{
				outFile = new FileOutputStream(new File("./Resources/Read_Write.xlsx"));
			}
			catch(Exception ex)
			{
				
			}
			wb.write(outFile);
			outFile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.TakesScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void pageTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);
	}

	public static void pageUrl() {
		String url = driver.getCurrentUrl();
	}

	public static void fillTextbox(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void btnClick(WebElement ref) {
		ref.click();
	}

	public static void handlingContinue() {
		driver.findElement(By.xpath("//input[@class='btn']")).click();

	}

	public static void mouseOver(WebElement e) {
		Actions a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void findYourHappyPlaceUrlLaunch() {
		chromeBrowser();
		launchUrl("https://www.findyourhappyplace.in/");
		maxWindow();
		implicitWait();
	}

	public static String getExcelDataNum(String fileName, String sheetName) throws IOException {

		InputStream ExcelFileToRead = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFWorkbook test = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheet(sheetName);
		String mobile = sheet.getRow(1).getCell(0).getRawValue();
		return mobile;

	}

	public static String getExcelDataText(String fileName, String sheetName) throws IOException {

		InputStream ExcelFileToRead = new FileInputStream(fileName);
		XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);
		XSSFWorkbook test = new XSSFWorkbook();
		XSSFSheet sheet = wb.getSheet(sheetName);
		String mail = sheet.getRow(1).getCell(1).getStringCellValue();
		return mail;

	}

	/*
	 * public static String readExcel(int rowNo, int cellno) throws IOException {
	 * 
	 * File f = new File(""); FileInputStream fin = new FileInputStream(f); Workbook
	 * book = new XSSFWorkbook(fin); Sheet sh = book.getSheet(""); Row r =
	 * sh.getRow(rowNo); Cell c = r.getCell(cellno); // type = c.getCellType();
	 * String name = ""; if (type == 1) { name = c.getStringCellValue(); } else if
	 * (DateUtil.isCellDateFormatted(c)) { Date da = c.getDateCellValue();
	 * SimpleDateFormat form = new SimpleDateFormat("dd-mm-yyyy"); name =
	 * form.format(da); } else { double d = c.getNumericCellValue(); long l = (long)
	 * d; name = String.valueOf(1);
	 * 
	 * }
	 * 
	 * return name;
	 * 
	 * }
	 *
	 */
	public XSSFSheet sh;
	public XSSFWorkbook Ref;
	public String Value;
	
	

	public String getValue(String SheetName, String className, String columnHeader) {
		
		try {
			
			FileInputStream file = new FileInputStream(new File("C:\\Project\\excel\\TestData.xlsm"));
			Ref = new XSSFWorkbook(file);
			sh = Ref.getSheet(SheetName);
			FormulaEvaluator FE = Ref.getCreationHelper().createFormulaEvaluator();
			int rownumber = getRownumber(className, columnHeader);
			int columnNumber = getColumnNumber(columnHeader);
			XSSFCell cell = sh.getRow(rownumber).getCell(columnNumber);
			if (cell != null) {
				
			Value = getCellValueAsString(cell, FE);
			
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return Value;
		}

	private String getCellValueAsString(XSSFCell cell, FormulaEvaluator FE) {
		if ((cell == null)	||	cell.getCellType() == CellType.BOOLEAN) {
			return "";
		}
		if (FE.evaluate(cell).getCellType()==CellType.FORMULA) {
			
		}
		
		DataFormatter DF = new DataFormatter();
		// TODO Auto-generated method stub
		return DF.formatCellValue(FE.evaluateInCell(cell));
	}

	public int getRownumber(String testCaseName, String colHeader) throws Exception {
		int rowNumber = 0;
		int rowCount = sh.getLastRowNum();

		for (int j = 1; j >= rowCount; j++) {
			XSSFRow row = sh.getRow(j);
			if (row.getCell(0).getStringCellValue().equalsIgnoreCase(testCaseName)) {
				System.out.println(testCaseName);
				rowNumber = j;
				break;
			}
		}
		if (rowNumber == 0) {
			throw new Exception("Class entry missing in DataSheet");
		}
		getColumnNumber(colHeader);
		return rowNumber;

	}


		public int getColumnNumber(String columnHeader) throws Exception{
			XSSFRow row = sh.getRow(0);
			int columnNumber = 0;
			int isValid = 0;
			for (int j=sh.getFirstRowNum(); j<row.getPhysicalNumberOfCells(); j++) {
				if (row.getCell(j).toString().equalsIgnoreCase(columnHeader)){
					columnNumber = j;
					isValid = 1;
					break;
				}
			}
			if (isValid == 0) {
				throw new Exception("Class entry missing in DataSheet");
			}
			return columnNumber;
		}
	 public static void screenshot() throws IOException {
		 String title = driver.getTitle();
		 
		 Date currentdate = new Date();
		 System.out.println(currentdate);
		 String modifieddate = currentdate.toString().replace("", "").replace("", "");
		File scrFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new  File(".//screenshot//"+modifieddate +"image.png"));
		
	 }
	 
	 public static void takeSnapShot() throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination
	                

	                File DestFile=new File("C:\\Project\\screenshot\\image.png");

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }
	// Java implementation of the approach
	 //public class GFG {

	 	// Function to return the modified string
	 	public static String extractInt(String str)
	 	{
	 		// Replacing every non-digit number
	 		// with a space(" ")
	 		str = str.replaceAll("[^0-9]", " "); // regular expression

	 		// Replace all the consecutive white
	 		// spaces with a single space
	 		str = str.replaceAll(" +", " ");

	 		if (str.equals(""))
	 			return "-1";

	 		return str;
	 	}
	 	public static String Validation(String Output, String Expected) {
		
	 	
	 	 SoftAssert s=new SoftAssert();
		   s.assertEquals(Output, Expected);
		   s.assertAll();
		return Expected;
	 	}
	 	
	 	public static void implicitWait() {
	 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		}
	 	
	 	
	 	}


	
 
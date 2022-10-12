package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

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
		handlingContinue();
    }
     	
      public static  String getExcelDataNum(String fileName, String sheetName) throws IOException {

    	  InputStream ExcelFileToRead = new FileInputStream(fileName);
          XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
          XSSFWorkbook test = new XSSFWorkbook(); 
          XSSFSheet sheet = wb.getSheet(sheetName);
          String mobile = sheet.getRow(1).getCell(0).getRawValue();
          return mobile;
                 
          
      } 
      
      public static String getExcelDataText(String fileName, String sheetName) throws IOException {

    	  InputStream ExcelFileToRead = new FileInputStream(fileName);
          XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead);
          XSSFWorkbook test = new XSSFWorkbook(); 
          XSSFSheet sheet = wb.getSheet(sheetName);
          String mail = sheet.getRow(1).getCell(1).getStringCellValue();
          return mail;
          
      } 
     
      public static String readExcel (int rowNo, int cellno) throws IOException {
    	  
    	  File f = new File("");
    	  FileInputStream fin =new FileInputStream(f);
    	  Workbook book = new XSSFWorkbook(fin);
    	  Sheet sh= book.getSheet("");
    	  Row r=sh.getRow(rowNo);
    	  Cell c=r.getCell(cellno);
    	int type= c.getCellType();
    	  
    	  
    	  
		return null;
    	  
      }
    }

	

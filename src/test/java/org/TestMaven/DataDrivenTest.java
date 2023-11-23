package org.TestMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File f = new File("C:\\Users\\susan\\eclipse-workspace\\TestMaven\\data\\Data.xlsx");// providing file location
		FileInputStream fi = new FileInputStream(f); // to convert the file
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(1);
		
		int numberOfRows = sh.getPhysicalNumberOfRows();
		System.out.println("Number of rows ="+ numberOfRows);
		
		int numberOfCells = r.getPhysicalNumberOfCells();
		System.out.println("Number of cell ="+ numberOfCells);
		
		Cell c = r.getCell(1);
		String username = c.getStringCellValue();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		
		Cell c2 = r.getCell(2);
		String password = c2.getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		
		Cell c3 = r.getCell(3);
		String location = c3.getStringCellValue();
		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
			}
		s.selectByValue(location);
		Thread.sleep(2000);
		
		Cell c4 = r.getCell(4);
		String hotel = c4.getStringCellValue();
		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(element2);
		List<WebElement> options2 = s2.getOptions();
		for (int i = 0; i < options2.size(); i++) {
			WebElement element3 = options2.get(i);
			String text = element3.getText();
			System.out.println(text);	
		}
		s2.selectByValue(hotel);
		
		Cell c5 = r.getCell(5);
		String roomType = c5.getStringCellValue();
		WebElement element3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(element3);
		//s3.selectByValue(roomType);
		s3.selectByVisibleText(roomType);
		
		Cell c6 = r.getCell(6);
		String noroom = c6.getStringCellValue();
		WebElement element4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s6 = new Select(element4);
		s6.selectByVisibleText(noroom);
		
		Cell c7 = r.getCell(7);
		String noadult = c7.getStringCellValue();
		WebElement element5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s7 = new Select(element5);
		s7.selectByVisibleText(noadult);
		
		Cell c8 = r.getCell(8);
		String child = c8.getStringCellValue();
		WebElement element6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s8 = new Select(element6);
		s8.selectByVisibleText(child);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		
		Cell c9 = r.getCell(9);
		String firstname = c9.getStringCellValue();
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(firstname);
		
		Cell c10 = r.getCell(10);
		String lastname = c10.getStringCellValue();
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lastname);
		
		Cell c11 = r.getCell(11);
		String address = c11.getStringCellValue();
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
		
		
		
		
		
	
	}

}

package org.TestMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Company {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://staging-app.roadninja.co.nz/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File f = new File("C:\\Users\\susan\\eclipse-workspace\\TestMaven\\data\\StagingAc.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(1);
		
		Cell c = r.getCell(1);
		String username = c.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		Cell c2 = r.getCell(2);
		String password = c2.getStringCellValue();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(2000); 
		
		WebElement element = driver.findElement(By.xpath("//aside[@class='Sidebar_root__1ymce']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
		driver.findElement(By.xpath("//a[@href='/drivers']")).click();
//		driver.findElement(By.xpath("//a[@href='/jobs']")).click();
//		driver.findElement(By.xpath("//a[@href='/company']")).click();
//		driver.findElement(By.xpath("//a[@href='/vehicles']")).click();
//		driver.findElement(By.xpath("//a[@href='/payments']")).click();
//		driver.findElement(By.xpath("//a[@href='/support']")).click();
//		driver.findElement(By.xpath("//a[@href='/terms']")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Log out')]")).click();
		
//		driver.findElement(By.xpath("//div[contains(text(),'When')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[contains(text(),'Add new period')]")).click();
//		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@value='08:00 am']")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'When')]"));
		
		
		
		
		
		
	}

}

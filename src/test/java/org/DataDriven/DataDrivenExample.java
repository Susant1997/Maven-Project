package org.DataDriven;

import java.io.File;
import java.io.FileInputStream;
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

import com.github.dockerjava.api.command.AttachContainerCmd.Exec;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenExample extends BaseClass1{
	
	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String username = excelRead(1, 1);
		String password = excelRead(1, 2);
		String location = excelRead(1, 3);
		String hotel = excelRead(1, 4);
		String roomType = excelRead(1, 5);
		String noroom = excelRead(1, 6);
		String date_in = excelRead(1, 7);
		String date_out = excelRead(1, 8);
		String adultroom = excelRead(1, 9);
		String childroom = excelRead(1, 10);
		String fname = excelRead(1, 11);
		String lname = excelRead(1, 12);
		String address = excelRead(1, 13);
		String cardno = excelRead(1, 14);
		
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		
		
		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(element);
		s.selectByValue(location);
		Thread.sleep(2000);
		
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(element2);
		s2.selectByValue(hotel);
		
		
		WebElement element3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(element3);
		//s3.selectByValue(roomType);
		s3.selectByVisibleText(roomType);
		
		
		WebElement element4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(element4);
		s4.selectByVisibleText(noroom);
		
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		element5.clear();
		element5.sendKeys(date_in);
		
		Thread.sleep(2000);
		WebElement element6 = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		element6.clear();
		element6.sendKeys(date_out);
	
		
		WebElement element8 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s7 = new Select(element8);
		s7.selectByVisibleText(adultroom);
		
		
		WebElement element7 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s8 = new Select(element7);
		s8.selectByVisibleText(childroom);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(fname);
		
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys(lname);
		
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(address);
		
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys(cardno);
		
		
	
	}

}

package org.PageMethod;

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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AdactinClass extends BaseClass {
	
public static void main(String[] args) throws Exception {
		
//		String url = excelRead(1, 0);
//		urlLaunch(url);//OR
		urlLaunch(excelRead(1, 1));
		
		maximize();
		Thread.sleep(2000);
		
//		String username = excelRead(1, 2);
//		String password = excelRead(1, 3);
//		String location = excelRead(1, 4);
//		String hotel = excelRead(1, 5);
//		String roomType = excelRead(1, 6);
//		String noroom = excelRead(1, 7);
//		String date_in = excelRead(1, 8);
//		String date_out = excelRead(1, 9);
//		String adultroom = excelRead(1, 10);
//		String childroom = excelRead(1, 11);
//		String fname = excelRead(1, 12);
//		String lname = excelRead(1, 13);
//		String address = excelRead(1, 14);
//		String cardno = excelRead(1, 15);
		
		findElement("//input[@id='username']");
		sendKeys(excelRead(1, 2)); // OR
//		sendKeys(username);
		
		
		findElement("//input[@id='password']");
		sendKeys(excelRead(1, 3));
		Thread.sleep(2000);
		
		findElement("//input[@id='login']");
		clicks();
		
		Thread.sleep(2000);
		
		findElement("//select[@id='location']");
		selectByvalue(excelRead(1, 4));

		findElement("//select[@id='hotels']");
		selectByvalue(excelRead(1, 5));
		
		findElement("//select[@name='room_type']");
		selectByVisibilText(excelRead(1, 6));
		
		findElement("//select[@name='room_nos']");
		selectByVisibilText(excelRead(1, 7));
		
		Thread.sleep(2000);
		findElement("//input[@id='datepick_in']");
		clear();
		sendKeys(excelRead(1, 8));
		
		Thread.sleep(2000);
		findElement("//input[@id='datepick_out']");
		clear();
		sendKeys(excelRead(1, 9));
		
		findElement("//select[@name='adult_room']");
		selectByVisibilText(excelRead(1, 10));
		
		findElement("//select[@name='child_room']");
		selectByVisibilText(excelRead(1, 11));
		
		findElement("//input[@id='Submit']");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@id='radiobutton_0']");
		clicks();
		
		findElement("//input[@id='continue']");
		clicks();
		Thread.sleep(2000);
		
		findElement("//input[@id='first_name']");
		sendKeys(excelRead(1, 12));
		
		findElement("//input[@id='last_name']");
		sendKeys(excelRead(1, 13));
		
		findElement("//textarea[@id='address']");
		sendKeys(excelRead(1, 14));
		
		findElement("//input[@id='cc_num']");
		sendKeys(excelRead(1, 15));
		
		findElement("//select[@id='cc_type']");
		selectByvalue(excelRead(1, 16));
		
		findElement("//select[@id='cc_exp_month']");
		selectByVisibilText(excelRead(1, 17));
		
		findElement("//select[@id='cc_exp_year']");
		selectByVisibilText(excelRead(1, 18));
		
		findElement("//input[@id='cc_cvv']");
		sendKeys(excelRead(1, 19));
		Thread.sleep(2000);
		
		findElement("//input[@id='book_now']");
		clicks();
		
		
		
		
	
	}



}

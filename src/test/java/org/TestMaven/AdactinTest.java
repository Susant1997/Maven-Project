package org.TestMaven;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
		driver.navigate().to("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// login form
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Susant1997");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("December@06");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		
		
		// select location
		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			String text = x.getText();
			System.out.println(text);
			}
		s.selectByValue("Sydney");
		
		// select hotels
		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select s2 = new Select(element2);
		List<WebElement> options2 = s2.getOptions();
		for (int i = 1; i < options2.size(); i++) {
			WebElement element3 = options2.get(i);
			String text = element3.getText();
			System.out.println(text);	
		}
		s2.selectByVisibleText("Hotel Creek");
		
		// select room type
		WebElement element3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(element3);
		s3.selectByIndex(1);
		
		// select number of room
		WebElement element4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(element4);
//		s4.selectByIndex(9);
		s4.selectByVisibleText("2 - Two");
		
		// select number of adults
		WebElement element5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5 = new Select(element5);
		s5.selectByValue("2");
		
		// select number of child
		WebElement element6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s6 = new Select(element6);
		s6.selectByIndex(0);
		
		Thread.sleep(2000);
		
		// to reset
//		driver.findElement(By.xpath("//input[@id='Reset']")).click();
		
		// to search
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		Thread.sleep(2000);
		
		// Radio button
	    driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
//	    Actions act = new Actions(driver);
//	    act.moveToElement(element11).perform();
//	    act.click();
	    
	    Thread.sleep(2000);
	    
	    // to continue
	    driver.findElement(By.xpath("//input[@id='continue']")).click();
	    
	    // Details provided
	    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Susant");
	    driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Bhandari");
	    driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("3 Harlech Glen, Bethlehem, Tauranga, New Zealand, 3110");
	    driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("4242424242424242");
	    
	    Thread.sleep(2000);
	    
	    // select CC 
	    WebElement element7 = driver.findElement(By.xpath("//select[@id='cc_type']"));
	    Select s7 = new Select(element7);
	    s7.selectByIndex(3);
	    
	    // select month
	    WebElement element8 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select s8 = new Select(element8);
		s8.selectByValue("12");
		
		// select year
		WebElement element9 = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select s9 = new Select(element9);
		s9.selectByVisibleText("2030");
		
		// CV number
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("567");
		
		Thread.sleep(2000);
		
		// Book Now
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		Thread.sleep(8000);
		
		TakesScreenshot scr = (TakesScreenshot)driver;
		File f = scr.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\susan\\OneDrive\\Pictures\\Saved Pictures\\book.jpg");
		FileUtils.copyFile(f, d);
		
		Thread.sleep(2000);
		
		// to print out the booking value
		WebElement element10 = driver.findElement(By.xpath("//input[@id='order_no']"));
		String attribute = element10.getAttribute("value");
		System.out.println(attribute);
//		driver.findElement(By.xpath("//input[@id='logout']")).click();
//		
//		Thread.sleep(2000);
//		driver.quit();
		
		
		
		
	}

}

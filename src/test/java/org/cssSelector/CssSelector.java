package org.cssSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
//		// For id tagName#IdValue
//		driver.findElement(By.cssSelector("input#username")).sendKeys("Susant");
//		
//		// For class  tagName.classValue
//		driver.findElement(By.cssSelector("input.login_input")).sendKeys("Susant");
//		
//		// name and other attributes
//		driver.findElement(By.cssSelector("input[name=username]")).sendKeys("Susant");
		
		// Startwith  - input[id$='mail']
		driver.findElement(By.cssSelector("input[id^='user']")).sendKeys("Susant");
		
		// Endswith - input[id^='em']
		driver.findElement(By.cssSelector("input[id$='name']")).sendKeys("Susant");
		
		// contains - input[id*='ma']
		driver.findElement(By.cssSelector("input[id*='rnam']")).sendKeys("Susant");
	}

}

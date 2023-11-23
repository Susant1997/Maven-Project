package org.testTryandCatch;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTryCatch {


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		try {
			driver.findElement(By.xpath("//input[@id='usernam']")).sendKeys("Susant");
			driver.findElement(By.xpath("//input[@id='passwod']")).sendKeys("Sus123");
		}


		catch (NoSuchElementException e) {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Susant2");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sus123");
		}
		finally {
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Susant3");
			driver.findElement(By.xpath("//input[@id='passwod']")).sendKeys("Sus123");
		}





	}

}




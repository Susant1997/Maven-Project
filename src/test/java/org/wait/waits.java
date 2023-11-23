package org.wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.PageMethod.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waits  {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	final WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		// implicit wait
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// Webdriver wait
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='username']"))).sendKeys("123456");
		
		
		// fluent wait
		
		Wait<WebDriver> wt = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(5))
								.pollingEvery(Duration.ofSeconds(1))
								.ignoring(NoSuchElementException.class);
		
		WebElement element4 = wt.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver input) {
				return driver.findElement(By.xpath("//input[@id='password']"));
			}

			
		
		});
		
		element4.sendKeys("134555");
		

	}

	

	}
	
package org.XpathAxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://bookcart.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//strong[contains(text(),'HP2')]//parent::a//parent::div//following-sibling::app-addtocart//child::button//child::span//child::span"));
		element.click();
		
		WebElement element1 = driver.findElement(By.xpath("//strong[contains(text(),'HP3')]//parent::a//parent::div//following-sibling::app-addtocart//child::button//child::span//child::span"));
		element1.click();
		
		WebElement element2 = driver.findElement(By.xpath("//*[contains(text(),'shopping_cart')]"));
		element2.click();
	}

}

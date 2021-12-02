package com_test.comscope;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPrintLink {

	@Test
	public void printLinks() {
		System.setProperty("webdriver.chrome.driver", "/Applications/WEbDrivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.commscope.com/");
		driver.findElement(By.id("desktop-search-bar")).sendKeys("ME-7000");
		driver.findElement(By.cssSelector("[aria-label='Search']")).click();
		//System.out.println(driver.findElements(By.tagName("a")).size()); 
		WebElement page = driver.findElement(By.id("facets-form"));
		List<WebElement> myLinks = page.findElements(By.tagName("a"));
		System.out.println("The links are :" + myLinks);
		for (int i=0; i<myLinks.size(); i++) {
			
			System.out.println("The link are "+ myLinks.get(i).getText());
			System.out.println("The link are "+ myLinks.get(i).getAttribute("href"));
		}
		
		
		
		
		driver.quit();
	
	}
}

package com.selenium.webDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * https://www.google.com/
 * open this site and search selinium
 */
public class TestOne {
	WebDriver driver;
	@BeforeMethod 
	public void openApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	@Test
	public void searchSelenium() {
		driver.findElement(By.name("q")).sendKeys("Selenium");
	}
	
	@AfterMethod 
	public void closeApplication() {
		driver.close();
	}

}

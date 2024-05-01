package com.selenium.webDriver;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * validate bank of America home title
 */
public class TestTwo {

	WebDriver driver;

	@BeforeMethod
	public void openApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bankofamerica.com/");
	}

	@Test
	public void searchSelenium() {
		String expectedTitle = driver.getTitle();
		String actualTitle = "Bank of America - Banking, Credit Cards, Loans and Merrill Investing";

		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterMethod
	public void closeApplication() {
		driver.close();
	}

}

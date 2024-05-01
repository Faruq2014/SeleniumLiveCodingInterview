package com.selenium.webDriver;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends BaseTest{
	@BeforeMethod
	public void openApp() {
		openApplication();
	}
@Test
  public void loginTest() {
	driver.findElement(By.name("q")).sendKeys("Selenium");
}
	
	@AfterMethod
	public void closeApp() {
		closeApplication();
	}
}

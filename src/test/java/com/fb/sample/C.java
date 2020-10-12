package com.fb.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C {
	
	WebDriver driver;
	@BeforeTest
	
	public void Setup()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void VerifyURL()
	{
		String s = driver.getCurrentUrl();
		Assert.assertEquals(s, "https://www.flipkart.com/");
	}
	
	@Test
	public void VerifyTitle()
	{
		Assert.assertEquals(driver.getTitle(), "Welcome");
	}
	
	@AfterTest
	
	public void Teardown()
	{
		driver.close();
	}


}

package com.fb.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@role='button'][@id='u_0_2']")).click();
		
       WebElement day =  driver.findElement(By.xpath("//select[@name='birthday_day']"));
       
       Select sel = new Select(day);
       sel.selectByIndex(17);
       
       List<WebElement> ll = sel.getOptions();
        int s=ll.size();
         for(int i=0;i<s-1;i++) 
   {
	     String sss= ll.get(i).getText();
	      System.out.println(sss);
   }
	    
	     WebElement month= driver.findElement(By.xpath("//select[@name='birthday_month']"));
	      Select sel1 = new Select(month);
	      sel1.selectByVisibleText("Apr");
	      
	     List<WebElement> day2 = sel1.getOptions();
	   int d=  day2.size();
	    for(int i=0;i<d-1;i++) 
	    {
	    	String ssss = day2.get(i).getText();
	    	System.out.println(ssss);
	    }
	   
	   WebElement year =  driver.findElement(By.xpath("//select[@aria-label='Year']"));
	   Select sel2= new Select(year);
	   sel2.selectByValue("1996");
	      
	    }
}

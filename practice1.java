package com.mindtree.seleniumclass;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("refrigerator");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    driver.findElement(By.xpath("//span[contains(text(),'Samsung 192 L 2')]")).click();
	    WebElement price1=driver.findElement(By.xpath("//span[@class = 'a-price-whole']"));
		String price=price1.getText();
		Set<String> id=driver.getWindowHandles();
		Iterator<String> Page=id.iterator();
		String page1=Page.next();
		String page2=Page.next();	
		driver.switchTo().window(page2);
		WebElement price2=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String pricenext=price2.getText();
	    if(pricenext.equals(price))
	    {
			System.out.println("Same Price");
		}
		else {
			System.out.println("Not Same");
		}
	    
	    
	   
	    
	}
	
	

}

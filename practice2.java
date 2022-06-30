package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("refrigerator");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//WebElement price1=driver.findElement(By.xpath("//span[contains(text(),'a-price-whole')"));
		//String price=price1.getText();
		//WebElement price2=driver.findElement(By.xpath(""))
	    WebElement price1=driver.findElement(By.xpath("//span[@class = 'a-price-whole']"));
		String price=price1.getText();
		WebElement price2=driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String pricenext=price2.getText();
		if(pricenext.equals(price))
		{
			System.out.println("Same Price");
		}
		else {
			System.out.println("Not Same");
		}
		WebElement weight1=driver.findElement(By.xpath("//table[@class='comparison_sim_items_column comparable_item1']"));
		String weight=weight1.getText();
		WebElement weight2=driver.findElement(By.xpath("//span[@class='a-size-base a-color-base']"));
		String weightnext=weight2.getText();
		if(weightnext.equals(weight))
		{
			System.out.println("Same Weight");
		}
		else {
			System.out.println("Different Weight");
		}		

	}

}

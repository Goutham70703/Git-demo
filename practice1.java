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
	    //driver.findElement(By.xpath("//input[@class='@/html/body'")).click();
	    //driver.findElement(By.xpath("//span[@class=]")).click();
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
	    /*int count=driver.findElement(By.xpath("//tr[@class='comparison_other_attribute_row']//th")).getText();
        for(int i=0; i<count;i++) {
        	WebElement weight=driver.findElement(By.xpath("tr[@class='comparison_other_attribute_row']//th"));
        	break;
        }*/

	    
	    //driver.navigate().to("https://www.amazon.in/Samsung-Direct-Refrigerator-RR19A241BGS-NL/dp/B08SC2ZTDP/ref=sr_1_3?keywords=refrigerator&qid=1656042569&sr=8-3");
	    // nav();
	    //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		//Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"))).click();
		//a.moveToElement(driver.findElement(By.id("a-page")).click();
	    //a.moveToElement(driver.findElement(By.id("a-page")).click();
	    //a.moveToElement(driver.findElement(By.id("a-page")).click();
	    //a.moveToElement(driver.findElement(By.id("Goutham");
	    
	   
	    
	}
	
	/*public static void  nav() {
		//WebDriver driver=new ChromeDriver();
		WebElement we = WebDriver.findElement(By.xpath("//*[@id=\\\"search\\\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		Actions a=new Actions(driver);
		a.moveToElement(we).build().perform();
	
		
	}*/

}

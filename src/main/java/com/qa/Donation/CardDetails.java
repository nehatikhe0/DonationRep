package com.qa.Donation;
import com.qa.Donation.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CardDetails extends Runner
{
	
	public void Card() throws InterruptedException
	{
		
	
	  WebElement CardNo=driver.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
	  CardNo.sendKeys("5186097634749999");
	  
	  WebElement Monthyr=driver.findElement(By.xpath("//*[@id=\"expiryDate\"]"));
	  Monthyr.sendKeys("12/32");
	  
	  WebElement CVV=driver.findElement(By.xpath("//*[@id=\"cvvNumber\"]"));
	  CVV.sendKeys("546");
	  
	  Thread.sleep(3000);
		
	  
	  WebElement Contribute=driver.findElement(By.xpath("//*[@id=\"donate-card-contribute\"]"));
	  Contribute.click();
	}
	
	

}

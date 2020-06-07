package com.qa.Donation;
import com.qa.Donation.Runner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Userdetails extends Runner
{
	
	public void Details() throws InterruptedException
	{
	//Thread.sleep(3000);
	
	WebElement SelectAmount=driver.findElement(By.xpath("(//*[@id=\"story-popup-donate-amt-option1\"])[1]"));
	SelectAmount.click();
	
	WebElement FullName=driver.findElement(By.xpath("//*[@id=\"full_name\"]"));
	FullName.sendKeys("Neha Tikhe");
	
	WebElement Email=driver.findElement(By.xpath("//*[@id=\"email_receipt\"]"));
	Email.sendKeys("nehatikhe@gmail.com");
	
	WebElement Mob=driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
	Mob.sendKeys("1234567890");
	
	WebElement City=driver.findElement(By.xpath("//*[@id=\"city_text\"]"));
	City.sendKeys("Nagpur");
	
	Thread.sleep(3000);
	
	WebElement DonateBtn=driver.findElement(By.xpath("//*[@id=\"story-popup-donate-button\"]"));
	DonateBtn.click();
	}
	
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

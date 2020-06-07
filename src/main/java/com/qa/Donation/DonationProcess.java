package com.qa.Donation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DonationProcess {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.driver","C:\\workspace\\Donation\\Driver\\geckodriver.exe");
		
        //WebDriver driver=new ChromeDriver();
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Runtime.getRuntime().exec("C:\\workspace\\Donation\\Signin\\donationnow.exe");
		
		driver.get("https://igstg.com/fundraiser/help-ek-fekf-new");
		
	

		try {
			
			Thread.sleep(5000);
			
			WebElement DonationNow=driver.findElement(By.xpath("//div[@class='px-2 rounded']//div[@class='w-100 d-block text-center mb-3 mb-md-2']"));
			DonationNow.click();
		} catch (Exception e) {
			// TODO: handle exception
		}	
		
		
		
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
		
		Thread.sleep(2000);
		
		
		  WebElement CardNo=driver.findElement(By.xpath("//*[@id=\"cardNumber\"]"));
		  CardNo.sendKeys("5186097634749999");
		  
		  WebElement Monthyr=driver.findElement(By.xpath("//*[@id=\"expiryDate\"]"));
		  Monthyr.sendKeys("12/32");
		  
		  WebElement CVV=driver.findElement(By.xpath("//*[@id=\"cvvNumber\"]"));
		  CVV.sendKeys("546");
		  
		  Thread.sleep(3000);
			
		  
		  WebElement Contribute=driver.findElement(By.xpath("//*[@id=\"donate-card-contribute\"]"));
		  Contribute.click();
		  
		 // Assert.assertEquals(Contribute, ActualTitle);
			
       //	driver.quit();
			
	}

}

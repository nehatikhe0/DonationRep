package com.qa.Donation;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Runner  {

	WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		DonationDetails obj=new DonationDetails();
		obj.Browsercall();
		obj.Details();
		obj.Card();
		
	}

	
}

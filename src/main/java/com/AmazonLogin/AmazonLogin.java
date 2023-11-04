package com.AmazonLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {
	
	public void loginAmazon() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
				
		
	}
	
	public static void main(String[] args) {
		AmazonLogin object = new AmazonLogin();
		object.loginAmazon();
	}

}

package com.Guru_Ecommerce.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class Base {
	
	public static WebDriver d;
	
	@BeforeClass
	public void bf() {
		
	//	WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("http://live.techpanda.org/index.php/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	@AfterClass
	public void ac() {
		d.quit();
	}

}

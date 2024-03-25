package com.Guru_E_Commerce;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Guru_Ecommerce.base.Base;

public class TestCase4 extends Base {
	
	@Test
	public void compareProducts() {
		
		d.findElement(By.linkText("MOBILE")).click();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[1]/div/div[3]/ul/li[2]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2]/div/div[3]/ul/li[2]/a")).click();
		
		d.findElement(By.xpath("//button[@title='Compare']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 String parentHandle = d.getWindowHandle();
	Set<String> windowHandles = d.getWindowHandles();
	
	for(String windowHandle:windowHandles) {
		
		if(!(windowHandle.equals(parentHandle))) {
			d.switchTo().window(windowHandle);
		String text =	d.findElement(By.id("product_comparison")).getText();
		System.out.println(text);
//		JavascriptExecutor js = (JavascriptExecutor)d;
//		js.executeScript("window.scrollBy(0,300)");
		d.findElement(By.xpath("//*[@title ='Close Window']")).click();
			
		}
	}
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	d.switchTo().window(parentHandle);
	System.out.println(d.getTitle());
	
	}

}

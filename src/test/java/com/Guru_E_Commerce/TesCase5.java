package com.Guru_E_Commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Guru_Ecommerce.base.Base;

public class TesCase5 extends Base{
	
	
	@Test(priority = 1)
	public void accountCraetion() {
		
		d.findElement(By.linkText("MY ACCOUNT")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.findElement(By.xpath("//a[@title='Create an Account']")).click();
		d.findElement(By.id("firstname")).sendKeys("xyz");
		d.findElement(By.id("middlename")).sendKeys("abc");
		d.findElement(By.id("lastname")).sendKeys("vag");
		d.findElement(By.id("email_address")).sendKeys("jbroman1088@gmail.com");
		d.findElement(By.id("password")).sendKeys("abe@123");
		d.findElement(By.id("confirmation")).sendKeys("abe@123");
		d.findElement(By.xpath("//button[@title='Register']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String title = d.getTitle();
		
		System.out.println((title.equals("My Account")) ? "Account creation is successful" : "account not created");
	}
	
	
	@Test(enabled = true , priority = 2)
	public void shareWishlist() {
		
		d.findElement(By.linkText("TV")).click();
		d.findElement(By.xpath("//*[@class='category-products']/ul/li[1]/div/div[3]/ul/li[1]/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.findElement(By.xpath("//*[@title ='Share Wishlist']")).click();
		d.findElement(By.id("email_address")).sendKeys("jbroman1088@gmail.com");
		d.findElement(By.id("message")).sendKeys("Check this product");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.findElement(By.cssSelector("[title='Share Wishlist']")).click();
		
		
	}

}

package com.Guru_E_Commerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Guru_Ecommerce.base.Base;

public class TestCase3 extends Base
{

	@Test
	public void errorValidation() {
		
		d.findElement(By.linkText("MOBILE")).click();
		d.findElement(By.xpath("//*[@class = 'category-products']/ul/li[1]/div/div[3]/button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	WebElement quantity =	d.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/input"));
	quantity.clear();
	quantity.sendKeys("10000");
	
	d.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/button")).click();
	String expectedErrorMessage =  d.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[2]/p")).getText();
	String actualErrorMessage = "* The maximum quantity allowed for purchase is 500.";
	
	assertEquals(actualErrorMessage, expectedErrorMessage,"Error Message didn't match");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	d.findElement(By.xpath("//table[@id = 'shopping-cart-table']/tfoot/tr/td/button[2]")).click();
	
	String expectedMessage = d.findElement(By.xpath("//div[@class = 'page-title']")).getText();
	String actualMessage = "SHOPPING CART IS EMPTY";
	
	assertEquals(actualMessage, expectedMessage,"Message didn't match");
		
	}
	
}

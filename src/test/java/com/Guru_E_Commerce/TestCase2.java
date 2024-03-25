package com.Guru_E_Commerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Guru_Ecommerce.base.Base;

public class TestCase2 extends Base {
	
	
	@Test
	public void VerifyCostOfProduct() {
		d.findElement(By.linkText("MOBILE")).click();
		String Sony_xperiaPrice = d.findElement(By.cssSelector("#product-price-1")).getText();
		d.findElement(By.id("product-collection-image-1")).click();
		
		String Sony_priced_detail_page = d.findElement(By.xpath("//*[@id ='product-price-1']")).getText();
		
		assertEquals(Sony_xperiaPrice, Sony_priced_detail_page, "price didn't matched");
		
		System.out.println(Sony_xperiaPrice + " " + Sony_priced_detail_page);
	}

}

//package com.Guru_E_Commerce;
//
//import static org.testng.Assert.assertEquals;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//import com.Guru_Ecommerce.base.Base;
//
//public class TestCase6 extends Base {
//
//	@Test
//	public void verifyPurchaseProduct() throws InterruptedException {
//
//		d.findElement(By.linkText("MY ACCOUNT")).click();
//		d.findElement(By.cssSelector("[id=email]")).sendKeys("1088@gmail.com");
//		d.findElement(By.cssSelector("[id=pass]")).sendKeys("123abc");
//		d.findElement(By.cssSelector("[id=send2]")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		d.findElement(By.linkText("MY WISHLIST")).click();
//		d.findElement(By.cssSelector("[title='Add to Cart']")).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//
//		WebElement country = d.findElement(By.id("country"));
//		Select countrySelect = new Select(country);
//		countrySelect.selectByVisibleText("United States");
//
//		WebElement stateSelection = d.findElement(By.id("region_id"));
//		Select sc = new Select(stateSelection);
//		sc.selectByVisibleText("New York");
//
//		d.findElement(By.id("postcode")).sendKeys("542896");
//		d.findElement(By.xpath("//*[@title ='Estimate']")).click();
//		Thread.sleep(2000);
//		d.findElement(By.id("s_method_flatrate_flatrate")).click();
//
//
//		String shippingPrice = d.findElement(By.xpath("//label[@for='s_method_flatrate_flatrate']/span")).getText();
//		String removedDollarSign = shippingPrice.replaceAll("\\$","");
//		double shippingPrize =  Double.parseDouble(removedDollarSign);
//		System.out.println(removedDollarSign);
//
//		assertEquals(shippingPrize, 5.00, "Shipping price didn't match");
//
//		d.findElement(By.cssSelector("[title='Update Total']")).click();
//		String productPrice = d.findElement(By.xpath("//*[@id='shopping-cart-totals-table']/tbody/tr[1]/td[2]/span")).getText();
//		String removedDollarSignForProductPrice = productPrice.replaceAll("\\$", "");
//		double actualpProductPrice = Double.parseDouble(removedDollarSignForProductPrice);
//
//
//		String addedShippingPriceToTotal =  d.findElement(By.xpath("//*[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span")).getText();
//		String removingDollarSign =addedShippingPriceToTotal.replaceAll("\\$", "");
//		double finalShippingPrice = Double.parseDouble(removingDollarSign);
//
//		double totalPrice = actualpProductPrice+finalShippingPrice;
//
//		System.out.println(totalPrice);
//
//		String totalPriceOfProduct =d.findElement(By.xpath("//*[@id='shopping-cart-totals-table']/tfoot/tr/td[2]/strong/span")).getText();
//		String removedDollartotalPriceOfProduct = totalPriceOfProduct.replaceAll("\\$", "");
//		double grandTotal = Double.parseDouble(removedDollartotalPriceOfProduct);
//
//		assertEquals(totalPrice, grandTotal, "Grand total price didn't match");
//
//		System.out.println(grandTotal);
//		Thread.sleep(3000);
//
//
//		//	    d.findElement(By.xpath("//ul[@class ='checkout-types top']/li/button")).click();
//		//	    
//		//	    try {
//		//			Thread.sleep(2000);
//		//		} catch (InterruptedException e) {
//		//			// TODO Auto-generated catch block
//		//			e.printStackTrace();
//		//		}
//		//	    
//		//	    d.findElement(By.id("billing:street1")).sendKeys("ABC");
//		//	    d.findElement(By.id("billing:city")).sendKeys("New York");
//		//	    
//		//	    WebElement state =d.findElement(By.id("billing:region_id"));
//		//	    Select sc = new Select(state);
//		//	    sc.selectByVisibleText("New York");
//		//	    
//		//	    d.findElement(By.id("billing:postcode")).sendKeys("542896");
//		//	    
//		//	    WebElement country = d.findElement(By.id("billing:country_id"));
//		//	    Select countrySelect = new Select(country);
//		//	    countrySelect.selectByVisibleText("United States");
//		//	    
//		//	    
//		//	    d.findElement(By.id("billing:telephone")).sendKeys("12345678");
//		//	    d.findElement(By.xpath("//div[@id='billing-buttons-container']/button")).click();
//		//	    
//		//	    String shippingPrice = d.findElement(By.xpath("//label[@for='s_method_flatrate_flatrate']/span")).getText();
//		//	  double shippingPrize =  Double.parseDouble(shippingPrice);
//		//	    
//		//	    System.out.println(shippingPrice);
//		//	    
//		//	    assertEquals(shippingPrize, 5.00, "Price didn't match");
//		//	    
//		//	    d.findElement(By.xpath("//*[@id ='shipping-method-buttons-container']/button")).click();
//		//	    d.findElement(By.id("p_method_checkmo")).click();
//		//	    d.findElement(By.xpath("//div[@id='payment-buttons-container']/button")).click();
//		//	    
//
//	}
//
//}

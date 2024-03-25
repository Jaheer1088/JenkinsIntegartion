package com.Guru_E_Commerce;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Guru_Ecommerce.base.Base;

public class TestCase1 extends Base {


	@Test
	public void MobilesSortedByNameTest() throws InterruptedException {

		String title = d.getTitle();
		System.out.println(title);

		String expected_title = "Home page";

		assertEquals(title, expected_title, "didn't match");

		String text =	d.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[1]/div/div/h2")).getText();
		String Expected_text = "THIS IS DEMO SITE FOR   " ;
		assertEquals(text, Expected_text, "didn't match");

		d.findElement(By.linkText("MOBILE")).click();

		Select sc = new Select(d.findElement(By.xpath("//select[@title=\"Sort By\"]")));

		List<WebElement> webelements =	d.findElements(By.xpath("//h2[@class='product-name']"));
		List<String> names = webelements.stream().map(n->n.getText()).collect(Collectors.toList());

		List<String> sorted_names = names;
		Collections.sort(sorted_names);



		sc.selectByVisibleText("Name");
		Thread.sleep(2000);

		List<WebElement> namesafterFilter =	d.findElements(By.xpath("//h2[@class='product-name']"));

		List<String > AfterFilter = namesafterFilter.stream().map(n->n.getText()).toList();

		Boolean test =  sorted_names.equals(sorted_names);
		System.out.println(test);





	}
}

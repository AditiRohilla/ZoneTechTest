package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClassZTT;

public class HomePage extends BaseClassZTT {
	public void i_am_in_HomePage() {
		Assert.assertEquals("BBC - Home", driver.getTitle());
	}

	public void i_select_the_iPlayer() {
		driver.findElement(By.linkText("iPlayer")).click();
	}

	public void i_enter_into_search_textbox(String search) {
		driver.findElement(By.cssSelector("#orb-search-q")).click();
		driver.findElement(By.cssSelector("#orb-search-q")).sendKeys(search);
		driver.findElement(By.cssSelector(".se-searchbox__submit")).click();
	}

	public void i_select_the_TV_option_under_More_option_in_header() {
		driver.findElement(By.cssSelector("a[data-alt='More']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("TV")));
		driver.findElement(By.linkText("TV")).click();
		
	}
	public void i_enter_in_search_box(String search1) {
		driver.findElement(By.cssSelector("#orb-search-q")).clear();
		driver.findElement(By.cssSelector("#orb-search-q")).sendKeys(search1);
		driver.findElement(By.cssSelector("button[data-reactid='13']")).click();	
	}

}

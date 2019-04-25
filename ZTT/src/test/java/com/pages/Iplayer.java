package com.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.runner.BaseClassZTT;

public class Iplayer extends BaseClassZTT {


	public void iplayer_page_is_opened() {
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);

	}

	public void i_enter_in_search_box(String search1) {
		driver.findElement(By.cssSelector("#orb-search-q")).clear();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.NANOSECONDS);
		driver.findElement(By.cssSelector("#orb-search-q")).sendKeys(search1);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.NANOSECONDS);
		driver.findElement(By.cssSelector("button[data-reactid='13']")).click();

	}

	public void iplayer_search_page_is_displayed() {
		Assert.assertEquals("BBC iPlayer - Search - EastEnders", driver.getTitle());
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.NANOSECONDS);
	}

	public void i_click_on_first_link() {
		driver.findElement(By.cssSelector("a[href*='episode/m0004j3z/eastenders-23042019']")).click();

	}

	public void i_select_Programme_website() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Programme website']")))
				.click();

	}

	public void i_click_on_channels_on_iplayer_page() {
		Assert.assertEquals("BBC iPlayer", driver.getTitle());
		driver.findElement(By.cssSelector("button[aria-label='Channels']")).click();

	}

	public void i_click_on_one() {
		List<WebElement> navigation = driver.findElements(By.className("scrollable-nav__item"));
		for (WebElement tabs : navigation) {
			if (tabs.getText().equalsIgnoreCase("BBC One")) {
				tabs.click();
				break;
			}
		}
	}

	public void i_click_on_Eastenders_link_under_soaps() {
		driver.findElement(By.cssSelector("a[aria-label*='EastEnders. Description: Drama. 23/04/2019:']")).click();

	}

}

package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Upwork {
	
	@Test
	public void verifyLoginButtonExists() {
		System.setProperty("webdriver.chrome.driver", "/Users/Hemil/repositories/upwork/chromedriver");
		
		ChromeDriver chromeDriver = new ChromeDriver();
		chromeDriver.get("https://phptravels.com/demo/");

		chromeDriver.findElement(By.cssSelector("a.login.log")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Verify that lgoin button exists on the page
		Assert.assertTrue(chromeDriver.findElements(By.cssSelector("a.login.log")).size() > 0 );
		
		// Can add more conditions to close the browser cleanly, but for now this will work
		chromeDriver.quit();
	}
}

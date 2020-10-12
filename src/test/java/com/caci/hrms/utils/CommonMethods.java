package com.caci.hrms.utils;

import org.openqa.selenium.WebElement;

public class CommonMethods {

	public static void senddata(WebElement element, String text) {
		isElementPresent(element);
		element.clear();
		element.sendKeys(text);
		
	}
	
	public static void click(WebElement element) {
		isElementPresent(element);
		element.click();
	}

	
	public static void staticwait(int second) {
		try {
			Thread.sleep(second*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean isElementPresent(WebElement element) {
		if (element.isDisplayed()) {
			return true;
		}
		
		else {
			System.out.println("Element is not displayed");
			return false;
		}
		
		
	}
	
	
	
	//Create a resuale method for explectwait. 
	//one method for visibality 
	//one method for clickability
	
}

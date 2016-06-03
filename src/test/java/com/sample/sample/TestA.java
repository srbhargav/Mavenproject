package com.sample.sample;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestA {
	WebDriver driver = new FirefoxDriver();

@Test
	
	public void testTitle(){
		
		driver.get("http://www.people.com/people/");
		String Title = driver.getTitle();
		System.out.println("Title:" + Title);
	}

	
@After

public void tearDown(){
	driver.quit();	
}

}

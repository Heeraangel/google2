package com.project1.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample {
	@Test
	public void sample()
	{
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = null;
		String url="https://www.google.com/";
		String browser="chrome";
		switch(browser)
		{
			case "chrome":
				driver=new ChromeDriver(options);
				break;
			case "edge":
				driver=new EdgeDriver();
				break;
		}
		driver.get(url);
		//Person1 updated
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("wikipedia",Keys.ENTER);
		driver.quit();
	}
}
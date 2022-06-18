package com.test.rough;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dharm\\OneDrive\\Documents\\SeleniumJar\\Chrome Exe\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver d = new  ChromeDriver();
		
		d.get("https://demo.guru99.com/v4/index.php");
d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr416792");
		d.findElement(By.xpath("//input[@name='password']")).sendKeys("zAbavuv");
		d.findElement(By.xpath("//input[@type='submit']")).click();
d.quit();
	}

}

package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginLinkedin {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.id("home-hero-sign-in-cta")).click();
		driver.findElement(By.id("username")).sendKeys("rahulsrinivasan1999@gmail.com");
		driver.findElement(By.id("password")).sendKeys("rahul@0512");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}

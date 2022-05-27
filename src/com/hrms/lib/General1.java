package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class General1 extends Global1 {
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Millan selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		
	}
	public void login() {
		driver.findElement(By.name(txt_LoginName)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(btn_Login)).click();
		System.out.println("Login Completed");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout Completed");
	}
	public void employeename() throws Exception{
		driver.switchTo().frame(frame);
		driver.findElement(By.linkText(link_EmployeeName)).click();
		driver.findElement(By.xpath(btn_Edit)).click();
		
		
		driver.findElement(By.name(txt_FirstName)).clear();
		
		Thread.sleep(3000);
		
		
		
		
		driver.findElement(By.name(txt_LastName)).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.name(txt_FirstName)).sendKeys(FirstName);
		driver.findElement(By.name(txt_LastName)).sendKeys(LastName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_Save)).click();
		driver.switchTo().defaultContent();
		
	}
	
}
	
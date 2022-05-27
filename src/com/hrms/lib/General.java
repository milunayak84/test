package com.hrms.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import com.hrms.utility.Log;

public class General extends Global {
	
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "C:\\Millan selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Reporter.log("Application Opened");
		Log.info("Application Opened");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application Closed");
		Log.info("Application Closed");
		
	}
	public void login() {
		driver.findElement(By.name(txt_LoginName)).sendKeys(un);
		driver.findElement(By.name(txt_Password)).sendKeys(pw);
		driver.findElement(By.name(btn_Login)).click();
		System.out.println("Login Completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
		
	}
	public void logout() {
		driver.findElement(By.linkText(link_Logout)).click();
		System.out.println("Logout Completed");
		Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}
	public void addemployee()throws Exception {
		driver.switchTo().frame(frame);
		System.out.println("Enter into Frame");
		driver.findElement(By.xpath(btn_Add)).click();
		System.out.println("Add btn Open");
	Thread.sleep(3000);
		driver.findElement(By.name(txt_LastName)).sendKeys(LastName);
		driver.findElement(By.name(txt_FirstName)).sendKeys(FirstName);
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_Save)).click();
		System.out.println("Add employee completed");
		driver.switchTo().defaultContent();
	}
	
	

}

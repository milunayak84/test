package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class General2 extends Global2{
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
	public void searchemployee() throws Exception {
		driver.switchTo().frame(frame);
		Select st=new Select(driver.findElement(By.name(select_dpd)));
		st.selectByIndex(1);;
		Thread.sleep(3000);
		driver.findElement(By.name(txt_SearchFor)).sendKeys(eid);
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_Search)).click();
		driver.findElement(By.name(link_CheckBox)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_Delete)).click();
		driver.switchTo().defaultContent();
		
	}

}

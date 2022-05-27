package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global1 {
	//Test data
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String FirstName="Milu";
	
	public String LastName="Nayak";
	
	//object
	public String txt_LoginName="txtUserName";
	public String txt_Password="txtPassword";
	public String btn_Login="Submit";
	public String link_Logout="Logout";
	public String frame="rightMenu";
	public String link_EmployeeName="Millan Nayak";
			
	public String btn_Edit="//input[@value='Edit'][@title='Edit'][@id='btnEditPers']";
	public String txt_FirstName="txtEmpFirstName";
	
	public String txt_LastName="txtEmpLastName";
	public String btn_Save="//input[@class='savebutton'][@name='EditMain'][@id='btnEditPers']";
	
	
													

}

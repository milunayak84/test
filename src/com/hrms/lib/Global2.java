package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global2 {
	//Test data
	public WebDriver driver;
	public String url="http://127.0.0.1/orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	public String eid="0007";
	
	//object
	public String txt_LoginName="txtUserName";
	public String txt_Password="txtPassword";
	public String btn_Login="Submit";
	public String frame="rightMenu";
	public String select_dpd="loc_code";
public String Index="1";
	public String txt_SearchFor="loc_name";
	public String btn_Search="//input[@class='plainbtn'][@value='Search']";
	public String link_CheckBox="chkLocID[]";
	public String btn_Delete="//input[@value='Delete']";
	public String link_Logout="Logout";
	
	

}

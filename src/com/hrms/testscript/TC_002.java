package com.hrms.testscript;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC_002 {
	@Test
	//public static void main(String args[]) throws Exception {
	
	public void tc_002() throws Exception{
		DOMConfigurator.configure("Log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.addemployee();
		obj.logout();
		obj.closeApplication();
	}

}

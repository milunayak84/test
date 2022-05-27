package com.hrms.testscript;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General2;

public class TC_004 {
	//public static void main(String args[])throws Exception {
	@Test
	public void tc_004()throws Exception {
		DOMConfigurator.configure("Log4j.xml");
	General2 obj=new General2();
	obj.openApplication();
	obj.login();
	obj.searchemployee();
	obj.logout();
	obj.closeApplication();
	
	

}
}

package com.hrms.testscript;

import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General1;

public class TC_003 {
	//public static void main(String args[])throws Exception {
	@Test
	public void tc_003()throws Exception {
		DOMConfigurator.configure("Log4j.xml");
		General1 obj=new General1();
obj.openApplication();
obj.login();
obj.employeename();
obj.logout();
obj.closeApplication();

	}
}

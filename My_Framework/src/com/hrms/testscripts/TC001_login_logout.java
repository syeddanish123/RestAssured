package com.hrms.testscripts;

import org.testng.annotations.Test;
import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

import com.hrms.lib.General;

public class TC001_login_logout {
 //Test Cases
	//public static void main(String args[]) 
	@Test  //<------ for testng implimentation
	public void Tc001()
	{ 
		//Log4j.xml file invoke 
		DOMConfigurator.configure("log4j.xml");
		
		General gn=new General();
		gn.openapplication();
		gn.login();
		gn.logout();
		gn.close();
		
	}
}

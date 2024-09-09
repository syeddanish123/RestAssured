package com.hrms.testscripts;

import com.hrms.lib.General;

import java.time.Duration;

import org.testng.annotations.Test;

public class TC002_Add_New_employee {

//Test Cases
	//public static void main(String args[]) 
	@Test  //<------ for testng implimentation
	public void Tc002()
	{
	
	General gn=new General();
	gn.openapplication();
	gn.maximizewindow();
	gn.implicitewait();
	gn.login();
	gn.addEmp("Syed","Danish");
    gn.logout();
	gn.close();
	
	}
}

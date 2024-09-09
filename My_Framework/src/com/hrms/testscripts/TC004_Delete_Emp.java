package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004_Delete_Emp
{
 //TC for delete Employee....
	
	//public static void main(String args[]) 
	@Test   //<------ for testng implimentation
	public void Tc004()
	{
		General gn=new General();
		gn.openapplication();
		gn.maximizewindow();
		gn.implicitewait();
		gn.login();
		gn.deleteEmp("3652");
		gn.logout();
		gn.close();
	}
}

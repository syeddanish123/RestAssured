package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;


public class TC003_EditEmployee
{
   //public static void main(String args[]) 
   @Test  //<------ for testng implimentation
	public void Tc003()
	{
	   General gn=new General();
	   gn.openapplication();
	   gn.maximizewindow();
	   gn.implicitewait();
	   gn.login();
	   gn.editEmp("3652","Oppps");
	   gn.logout();
	   gn.close();
	   
   }
	
}

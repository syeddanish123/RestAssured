package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Global {
// Objects and elements
	
	public WebDriver driver;
    public  Select select;
	
	//TestData
 String url="http://183.82.103.245/nareshit/login.php";
 String un="nareshit";
 String pw="nareshit";
 

 
 //Elements
 String element_name="txtUserName";
 String element_password="txtPassword";
 String element_login="Submit";
 String element_logout="Logout";
 String element_Add="//input[@value='Add']";
 String Name_element_firstname="txtEmpFirstName";
 String Name_element_lastname="txtEmpLastName";
 String Xpath_element_save="//input[@id='btnEdit']";
 String Name_Select_Search="loc_code";
 String element_search_text="loc_name";
 String element_search_Empname="//form[@id='standardView']/table/tbody/tr/td[3]/a";
 String Name_element_editbtn="EditMain";
 String Name_editbtn="txtEmpMiddleName";
 String Name_editsave="EditMain";
 String Empid="Emp. ID";
 String Editsearch="//input[@value='Search']";
 String Name_Checkbox="chkLocID[]";
 String Deletesearch="//input[@value='Delete']";
 
}

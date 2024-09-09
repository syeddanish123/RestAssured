package com.hrms.lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.hrms.lib.Global;
import com.hrms.log4j.Log;

public class General extends Global {
//Reusable Functions

	
 public void openapplication() 
 {
	 
	 driver=new FirefoxDriver();
	 driver.get(url);
	 Log.info("Application opened");   //Whatever the text we want to print in log file
	 
 }
 
 public void maximizewindow() 
 {
	 driver.manage().window().maximize();
	 
 }
 
 public void implicitewait() 
 {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 }
 
 public void login() 
 {
	 
	 driver.findElement(By.name(element_name)).sendKeys(un);
	 driver.findElement(By.name(element_password)).sendKeys(pw);
	 driver.findElement(By.name(element_login)).click();
 }
 
 public void logout() 
 {
	 
	 driver.findElement(By.linkText(element_logout)).click();
 }
 
 public void close() 
 {
	 
	 driver.close();
	 Log.info("Application Closed");    //Whatever the text we want to print in log file
	 
 }
 
 public void addEmp(String firstname,String lastname) 
 {
	 driver.switchTo().frame("rightMenu");
	 driver.findElement(By.xpath(element_Add)).click();
	 driver.findElement(By.name(Name_element_firstname)).sendKeys(firstname);
	 driver.findElement(By.name(Name_element_lastname)).sendKeys(lastname);
	 driver.findElement(By.xpath(Xpath_element_save)).click();
	 driver.switchTo().defaultContent();
 }
 
 public void editEmp(String EmployeeNo,String middlename) 
 {
	 driver.switchTo().frame("rightMenu");
	 select=new Select(driver.findElement(By.name(Name_Select_Search)));
	 select.selectByVisibleText(Empid);
	 driver.findElement(By.name(element_search_text)).sendKeys(EmployeeNo);
	 driver.findElement(By.xpath(Editsearch)).click();
	 driver.findElement(By.xpath(element_search_Empname)).click();
	 driver.findElement(By.name(Name_element_editbtn)).click();
	 driver.findElement(By.name(Name_editbtn)).clear();
	 driver.findElement(By.name(Name_editbtn)).sendKeys(middlename);
	 driver.findElement(By.name(Name_editsave)).click();
	 driver.switchTo().defaultContent();
 }
 
 public void deleteEmp(String Empno)
 {
	 driver.switchTo().frame("rightMenu");
	 select=new Select(driver.findElement(By.name(Name_Select_Search)));
	 select.selectByVisibleText(Empid);
	 driver.findElement(By.name(element_search_text)).sendKeys(Empno);
	 driver.findElement(By.xpath(Editsearch)).click();
	 driver.findElement(By.name(Name_Checkbox)).click();
	 driver.findElement(By.xpath(Deletesearch)).click();
	 driver.switchTo().defaultContent();
 }
}

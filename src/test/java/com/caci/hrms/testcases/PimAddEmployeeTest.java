package com.caci.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.caci.hrms.base.PageIntializer;
import com.caci.hrms.utils.CommonMethods;
import com.caci.hrms.utils.ConfigReader;



public class PimAddEmployeeTest extends PageIntializer{

		
	@Test()
	public void Login_TC001() throws InterruptedException {
//	   CommonMethods.senddata(loginpage.UserName,ConfigReader.getProperty("UserName"));
//	   CommonMethods.senddata(loginpage.Password, ConfigReader.getProperty("Password"));
//	   CommonMethods.click(loginpage.LoginButton);	 
	   
		loginpage.loginDetails(ConfigReader.getProperty("UserName"), ConfigReader.getProperty("Password"));
	   addEmployee.RipTab.click();
	   CommonMethods.staticwait(3);
	   addEmployee.AddButton.click();
	   addEmployee.firstName.sendKeys(ConfigReader.getProperty("FirstName"));
	   addEmployee.middleName.sendKeys(ConfigReader.getProperty("MiddleName"));
	   addEmployee.lastName.sendKeys(ConfigReader.getProperty("LastName"));
	   String expectedValue=addEmployee.employeeId.getAttribute("value");
	   addEmployee.SaveButton.click();
	   String ActualValue=addEmployee.PersonalEmployeeId.getAttribute("value");
	   CommonMethods.staticwait(3);
	   System.out.println("expectedValue: " +expectedValue);
	   System.out.println("ActualValue: " +ActualValue);
	   Assert.assertEquals(expectedValue, ActualValue, "fails if values are not matching");
	  
	   CommonMethods.staticwait(3);
}		
	
		
	 
	
	
	
	
	
}


		
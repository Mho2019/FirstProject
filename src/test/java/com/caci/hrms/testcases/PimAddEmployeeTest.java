package com.caci.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.caci.hrms.base.PageIntializer;
import com.caci.hrms.utils.CommonMethods;
import com.caci.hrms.utils.ConfigReader;
import com.caci.hrms.utils.ExcelUtility;



public class PimAddEmployeeTest extends PageIntializer{

		
	@Test(dataProvider="TestData")
	public void addEmp_TC001(String FristName, String MiddleNM, String LastNM) throws InterruptedException {
//	   CommonMethods.senddata(loginpage.UserName,ConfigReader.getProperty("UserName"));
//	   CommonMethods.senddata(loginpage.Password, ConfigReader.getProperty("Password"));
//	   CommonMethods.click(loginpage.LoginButton);	 
	   
	   loginpage.loginDetails(ConfigReader.getProperty("UserName"), ConfigReader.getProperty("Password"));
	   addEmployee.RipTab.click();
	   CommonMethods.staticwait(3);
	   addEmployee.AddButton.click();
	   
	   CommonMethods.senddata(addEmployee.firstName,FristName);
	   CommonMethods.senddata(addEmployee.middleName,MiddleNM);
	   CommonMethods.senddata(addEmployee.lastName,LastNM);
	   String expectedValue=addEmployee.employeeId.getAttribute("value");
	   CommonMethods.click(addEmployee.SaveButton);
	   String ActualValue=addEmployee.PersonalEmployeeId.getAttribute("value");
	   CommonMethods.staticwait(3);
	   System.out.println("expectedValue: " +expectedValue);
	   System.out.println("ActualValue: " +ActualValue);
	   Assert.assertEquals(expectedValue, ActualValue, "fails if values are not matching");
	  
	   CommonMethods.staticwait(3);
}		
	
		
	 
	@DataProvider(name="TestData")
	public Object[][] getExcelData(){
	return ExcelUtility.exceldata("C:\\Users\\Dell\\Desktop\\personnal\\Selenium bible\\Testdata.xlsx", "addEmp");
		
}
	
	
	
	
}


		
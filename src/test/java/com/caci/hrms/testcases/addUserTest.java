package com.caci.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.caci.hrms.base.PageIntializer;
import com.caci.hrms.pages.AddUserPage;
import com.caci.hrms.utils.CommonMethods;
import com.caci.hrms.utils.ConfigReader;
import com.caci.hrms.utils.Constants;
import com.caci.hrms.utils.ExcelUtility;

public class addUserTest extends PageIntializer {

	@Test(dataProvider="TestData")
	public void addUser_TC001(String EmployeeName, String Username, String Password, String ConfirmPassword) {
		
		loginpage.loginDetails(ConfigReader.getProperty("UserName"), ConfigReader.getProperty("Password"));
	
		CommonMethods.click(adduserpage.AdminTab);
		//adduserpage.AdminTab.click();
		CommonMethods.click(adduserpage.AddButton);
		CommonMethods.staticwait(2);
		CommonMethods.senddata(adduserpage.employeeName,EmployeeName);
		CommonMethods.senddata(adduserpage.userName,Username);
		CommonMethods.senddata(adduserpage.password,Password);
		CommonMethods.senddata(adduserpage.confirmPassword,ConfirmPassword); 
		CommonMethods.click(adduserpage.btnSave);
		CommonMethods.staticwait(3);
		
		
	}
	
	
	@DataProvider(name="TestData")
	public Object[][] getExcelData(){
	return ExcelUtility.exceldata(Constants.EXCEL_FILE_PATH, "AddUser");
		
}
}

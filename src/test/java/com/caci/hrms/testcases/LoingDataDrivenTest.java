package com.caci.hrms.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.caci.hrms.base.PageIntializer;
import com.caci.hrms.utils.CommonMethods;
import com.caci.hrms.utils.ConfigReader;
import com.caci.hrms.utils.ExcelUtility;

public class LoingDataDrivenTest extends PageIntializer{

	@Test(dataProvider="TestData")
	public void InvalidUserID_TC002(String UserName, String Password, String ErrorMsg) {
		CommonMethods.senddata(loginpage.UserName, UserName);
		CommonMethods.senddata(loginpage.Password, Password);
		CommonMethods.click(loginpage.LoginButton);
		
		String ActulErrorMsg = loginpage.InvalidMsg.getText();
		System.out.println(ActulErrorMsg);
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ActulErrorMsg, ErrorMsg, "if expected value does not match test cases fails");
		sa.assertAll();
	}
	
	@DataProvider(name="TestData")
	public Object[][] getExcelData(){
	return ExcelUtility.exceldata("C:\\Users\\Dell\\Desktop\\personnal\\Selenium bible\\Testdata.xlsx", "Sheet3");
		
}
}
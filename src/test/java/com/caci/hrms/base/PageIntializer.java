package com.caci.hrms.base;

import com.caci.hrms.pages.AddUserPage;
import com.caci.hrms.pages.LogOutPage;
import com.caci.hrms.pages.LoginPage;
import com.caci.hrms.pages.PimAddEmployeePage;
import com.caci.hrms.testcases.addUserTest;

public class PageIntializer extends BaseClass {
	public static LoginPage loginpage;
	public static PimAddEmployeePage addEmployee;
	public static LogOutPage logoutpage;
	public static AddUserPage adduserpage;
	
	public static void intialize() {
		 loginpage= new LoginPage();
		 addEmployee = new PimAddEmployeePage();
		 logoutpage = new LogOutPage();
		 adduserpage = new AddUserPage();
	}
	
	
	
}

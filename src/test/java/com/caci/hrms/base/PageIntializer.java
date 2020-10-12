package com.caci.hrms.base;

import com.caci.hrms.pages.LoginPage;
import com.caci.hrms.pages.PimAddEmployeePage;

public class PageIntializer extends BaseClass {
	public static LoginPage loginpage;
	public static PimAddEmployeePage addEmployee;
	
	public static void intialize() {
		 loginpage= new LoginPage();
		 addEmployee = new PimAddEmployeePage();
	}
	
	
	
}

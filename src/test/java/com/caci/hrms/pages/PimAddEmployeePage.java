package com.caci.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caci.hrms.base.BaseClass;

public class PimAddEmployeePage extends BaseClass{

		
	@FindBy(xpath="//*[@id=\'menu_pim_viewPimModule\']/b")
	public WebElement RipTab;
	
	@FindBy(id="btnAdd")
	public WebElement AddButton;
	
	//add emplayee list tab
	
	@FindBy(name="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(name="lastName")
	public WebElement lastName;
	
	@FindBy(id="btnSave")
	public WebElement SaveButton;
	
	@FindBy(id="employeeId")
	public WebElement employeeId;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement PersonalEmployeeId;
	
	
		
	
	public PimAddEmployeePage(){
		PageFactory.initElements(driver, this);
	}
}






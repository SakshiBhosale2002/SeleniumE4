package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsRegister 
{
	public DwsRegister(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(className="ico-register")
	public WebElement register_link;
	
	@FindBy(id="gender-female")
	public WebElement gender;
	
	@FindBy(id="FirstName")
	public WebElement FirstName;
	
	@FindBy(id="LastName")
	public WebElement LastName;
	
	@FindBy(id="Email")
	public WebElement email;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(name="ConfirmPassword")
	public WebElement confirmpassword;
	
	@FindBy(id="register-button")
	public WebElement register_button;
	
	public void Register(String FirstName1,String LastName1,String email1,String password1,String confirmpassword1   ) 
	{
		register_link.click();
		gender.click();
		FirstName.sendKeys(FirstName1);
		LastName.sendKeys(LastName1);
		email.sendKeys(email1);
		password.sendKeys(password1);
		confirmpassword.sendKeys(confirmpassword1);
		register_button.click();
		
		
		
	}
	

}

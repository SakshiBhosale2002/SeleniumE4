package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsPage 
{
	public void HomePage (WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(className="header-logo")
	public WebElement logo;
	@FindBy(className="ico-register")
	public WebElement register_link;
	@FindBy(className="ico-login")
	public WebElement login_link;
	@FindBy(className="ico-cart")
	public WebElement cart_link;
	@FindBy(id="small-searchterms")
	public WebElement search;
	
	public void logo1() 
	{
		logo.click();
		
	}
	
	public void register_link() 
	{
		register_link.click();
	}

	public void login_link() 
	{
		login_link();
		
	}

	public void cart_link() 
	{
		
		cart_link.click();
		
	}

	public void search() 
	{
		search.click();
			
	}

	
	

	
	
	
	
	

}

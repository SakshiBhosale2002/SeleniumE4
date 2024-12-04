package com.crm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class DwsListeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestStart :"+name,true);
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestSuccess :"+name,true);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestFailure :"+name,true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("onTestSkipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestFailedButWithinSuccessPercentage :"+name,true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		String name=result.getMethod().getMethodName();
		Reporter.log("onTestFailedWithTimeout :"+name,true);
	}

	@Override
	public void onStart(ITestContext context) 
	{
		String name= context.getName();
		Reporter.log("onStart :"+name,true);
	}
	

	@Override
	public void onFinish(ITestContext context) {
		String name= context.getName();
		Reporter.log("onFinish :" +name,true);
	}

}

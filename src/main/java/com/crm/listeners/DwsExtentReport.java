package com.crm.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DwsExtentReport implements ITestListener
{
	
      public static ExtentSparkReporter spark;
      public static ExtentReports report;
      public static ExtentTest test;


		@Override
		public void onTestStart(ITestResult result)
		{
			String name=result.getMethod().getMethodName();
			test=report.createTest(name);
		
		}

		@Override
		public void onTestSuccess(ITestResult result) 
		{
			String name=result.getMethod().getMethodName();
			test.log(Status.INFO,"onTestSuccess");
			test.log(Status.PASS,name+" is Success");
			
		}

		@Override
		public void onTestFailure(ITestResult result)
		{
			String name=result.getMethod().getMethodName();
			test.log(Status.INFO,"ontestfailure");
			test.log(Status.FAIL,name+" is failure");
			
			
		}
		@Override
		public void onTestSkipped(ITestResult result) 
		{
			String name=result.getMethod().getMethodName();
			test.log(Status.INFO,"ontestfailure");
			test.log(Status.SKIP,name+" is Skipped");
			
		}
		@Override
		public void onStart(ITestContext context) 
		{
			//create ExtentsparkReporter
			spark=new ExtentSparkReporter("src/main/resources/TestCase.html");
			spark.config().setDocumentTitle("honda kawasaki royal enfield");
			spark.config().setReportName("Mayuresh");
			spark.config().setTheme(Theme.DARK);
			//create EXtentReports
			report=new ExtentReports();
			report.setSystemInfo("Os","linux");
			report.setSystemInfo("browser","chrome-101");
			//attach spark
			report.attachReporter(spark);
			
			
		}
		@Override
		public void onFinish(ITestContext context) {
			String name= context.getName();
			report.flush();
		}
			
			
		
 
 

}

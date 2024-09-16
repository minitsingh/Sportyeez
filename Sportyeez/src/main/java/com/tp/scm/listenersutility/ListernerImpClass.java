package com.tp.scm.listenersutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.tp.scm.basetest.BaseClass;
import com.tp.scm.generic.webdriverutility.UtilityClassObject;
/**
 * @author MINIT SINGH
 */
public class ListernerImpClass implements ITestListener,ISuiteListener {

	public ExtentSparkReporter spark;
	public ExtentReports report;
	public ExtentTest test;
	
	@Override
	public void onStart(ISuite suite) {
		System.out.println("---Report Configuration----");
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		
		spark = new ExtentSparkReporter("./AdvanceReport/report_"+time+".html");
		spark.config().setDocumentTitle("Sportyeez Test Suite Result");
		spark.config().setReportName("Sportyeez Report");
		spark.config().setTheme(Theme.DARK);
		
		/**
		 * Add Environment information & create test
		 */
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS","Windows-11");
		report.setSystemInfo("Browser","Chrome-100");
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("---Report Backup---");
		report.flush();
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("----->"+result.getMethod().getMethodName()+">--Start---");
		test = report.createTest(result.getMethod().getMethodName());
		
		UtilityClassObject.setTest(test);
		test.log(Status.INFO, result.getMethod().getMethodName()+"---> STARTED <---");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("--->"+result.getMethod().getMethodName()+">---End----");
		test.log(Status.PASS, result.getMethod().getMethodName()+"----> COMPLETED <----");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("---->"+result.getMethod().getMethodName()+"---> Taking SS <----");
		String testName = result.getMethod().getMethodName();
		
		TakesScreenshot ts = (TakesScreenshot)BaseClass.sdriver;
		String filePath = ts.getScreenshotAs(OutputType.BASE64);
		
		String time = new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(filePath,testName+"_"+time);
		
		test.log(Status.FAIL, result.getMethod().getMethodName()+"===> Failed <===");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}

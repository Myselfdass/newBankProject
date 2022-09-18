package org.extentsReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentsReport {

	public ExtentReports reports;
	
	public void createInstance() {
		ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\91971\\eclipse-workspace\\BankProject\\target");
		reports = new ExtentReports();
		reports.attachReporter(spark);
	}
	
	
	
}

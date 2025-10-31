package week6.day1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtent {
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		ExtentReports reports=new ExtentReports();
		
		reports.attachReporter(reporter);
		
		//create the testcase and description of the testcase
		ExtentTest test=reports.createTest("Createlead","Createlead with mandotary details");
		
		
		//assign
		test.assignAuthor("sarathy");
		test.assignCategory("smoke");
		
		//test level steps
		
		//test.pass("uname entered successfully");
		test.pass("password entered successfully");
		test.fail("username not entered sucessfully");
		reports.flush();
		
	}

}

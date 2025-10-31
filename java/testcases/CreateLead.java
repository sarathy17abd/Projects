package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends SourceClass{

	@Test(dataProvider="fetchdata")
	public  void runCreateLead(String cname,String fname,String lname) {
		
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider(name="fetchdata")
	public String[][] create() {
		
		String[][] data=new String[2][3];
		data[0][0]="testleaf";
		data[0][1]="sandhya";
		data[0][2]="S";
		
		data[1][0]="tcs";
		data[1][1]="shruthi";
		data[1][2]="s";
		
		return data;
		
	}
}







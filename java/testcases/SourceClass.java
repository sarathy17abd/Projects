package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SourceClass {
	public String excelfilename;
	public ChromeDriver driver;
	@DataProvider(name="fetchdata")
	public String[][] create() throws IOException {
		
		
		
		String[][] data = CommonExcelIntegration.database(excelfilename);
		return data;
		
	}
	@Parameters({"url","username","password"})
	@BeforeMethod
	
	public void prefunction(String url,String Uname,String pwd) {
	
	 ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
	    driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
	}
	@AfterMethod
	public void postfunction() {
		driver.close();
	}

	
		
		
			
		
	
		
		

	
	
		

	}



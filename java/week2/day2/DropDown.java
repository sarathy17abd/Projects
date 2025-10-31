package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads
		driver.findElement(By.linkText("Leads")).click();
		//createlead
		driver.findElement(By.linkText("Create Lead")).click();
		//company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		//lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		//locate the source DD
				WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
				//instantiate the select class
				Select select=new Select(sourceDD);
				select.selectByIndex(4);
				//industryDD
				WebElement industryDD = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select sel=new Select(industryDD);
				sel.selectByValue("IND_MEDIA");


		

	}

}

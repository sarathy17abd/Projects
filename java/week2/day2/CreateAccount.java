package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("ilavarasi");
		driver.findElement(By.name("description")).sendKeys("selenium automation tester");
		
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select select=new Select(industryDD);
		select.selectByIndex(3);
		
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select select1=new Select(ownershipDD);
		select1.selectByVisibleText("S-Corporation");
		driver.findElement(By.className("smallSubmit")).click();
		
	
	
		
				

	}
}

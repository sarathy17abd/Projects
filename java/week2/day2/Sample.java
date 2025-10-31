package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		//title
		String title=driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click on lead tab
		driver.findElement(By.linkText("Leads")).click();
		//click on find lead
		driver.findElement(By.linkText("Find Leads")).click();
		//enter phone tab
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		//enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("99");
		//click find leads
		driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		Thread.sleep(3000);
		//Capture the lead ID of 10177
		WebElement id=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		String text= id.getText();
	    System.out.println(text);
	    id.click();
		//click the delete lead ID
		driver.findElement(By.linkText("Delete")).click();
		//click on find leads again
		driver.findElement(By.linkText("Find Leads")).click();
		//enterName and ID
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		//enter the capture ID 
		driver.findElement(By.name("id")).sendKeys(text);
		//again find leads
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		String text2 = driver.findElement(By.className("x-paging-info")).getText();
		System.out.println(text2);
		driver.close();

	}

}

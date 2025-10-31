package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev194776.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.className("form-control")).sendKeys("admin");
		
		driver.findElement(By.id("user_password")).sendKeys("mZE@l60wP%iO");
		
		driver.findElement(By.name("not_important")).click();
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(20);
		
		shadow.findElementByXPath(("//div[@id='d6e462a5c3533010cbd77096e940dd8c']")).click();
		
		 shadow.findElementByXPath(("//input[@id='filter']")).click();
	
		shadow.findElementByXPath(("//span[text()='Service Catalog']")).click();
		
		WebElement frame = shadow.findElementByXPath(("//iframe[@id='gsft_main']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("//span[@class='input-group-radio']")).click();
		
		driver.findElement(By.xpath("//input[@id='IO:43d5c38a9707011021983d1e6253af8a']")).sendKeys("99");
		
		driver.findElement(By.xpath("//select[@id='IO:33494b069747011021983d1e6253af45']")).click();
		
		driver.findElement(By.xpath("//option[text()='Unlimited [add $4.00]']")).click();
		
		driver.findElement(By.xpath("//span[@class='input-group-radio']")).click();
		
		driver.findElement(By.xpath("(//span[@class='input-group-radio'])[11]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		
		String text = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println(text);


	}

}

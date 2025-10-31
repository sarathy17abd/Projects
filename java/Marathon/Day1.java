package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("cinemas-inactive")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		driver.findElement(By.xpath("(//span[text()='BAD GIRL'])[2]")).click();
		//driver.findElement(By.xpath("(//span[text()='MADHARAASI'])[4]")).click();
		
	    driver.findElement(By.xpath("//span[text()='04:10 PM']")).click();
		//driver.findElement(By.xpath("//span[text()='12:00 PM']"));
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c'])[5]")).click();
		driver.findElement(By.xpath("//button[@class='sc-dFVmKS YKWSW reject-terms']")).click();
		driver.findElement(By.xpath("//span[@id='SL.SILVER|B:8']")).click();
		driver.findElement(By.xpath("//button[@class='sc-eVqvcJ gITaIu btn-proceeded']")).click();		
	}

}

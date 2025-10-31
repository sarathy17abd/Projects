package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathExample {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("// input[@id='username']")).sendKeys("demosalesmanager.com");
	driver.findElement(By.xpath("// input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("// input[@class='decorativeSubmit']")).click();	

	}

}

package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sarathy");
		driver.findElement(By.id("pass")).sendKeys("Ilavarasi");
		driver.findElement(By.id("login")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}

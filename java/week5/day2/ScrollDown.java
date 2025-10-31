package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		
		WebElement scroll = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		
		System.out.println(scroll.getText());
		


	}

}

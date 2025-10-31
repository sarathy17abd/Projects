package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement mH = driver.findElement(By.xpath("//span[@class='catText']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(mH).perform();
		
		driver.findElement(By.xpath("(//span[@class='linkTest'])[4]")).click();
		
		WebElement sD = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[3]"));
		
		act.scrollToElement(sD).perform();
		//sD.click();

	}

}

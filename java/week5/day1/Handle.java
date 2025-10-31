package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle {
	
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> child = driver.getWindowHandles();
		String windowHandle = driver.getWindowHandle();
		
		List<String> list=new ArrayList<String>(child);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		System.out.println(windowHandle);
	}

}

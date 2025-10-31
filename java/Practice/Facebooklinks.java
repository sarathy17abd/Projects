package Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebooklinks {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		
		int size = allLinks.size();
		
		System.out.println(size);
		
		List<String> list=new ArrayList<String>();
		for (WebElement webElement : allLinks) {
			
			
			String text = webElement.getText();
			//System.out.println(text);
			list.add(text);
			
		}
		System.out.println(list);
	}

}

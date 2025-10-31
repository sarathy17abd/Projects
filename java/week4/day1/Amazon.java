package week4.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	    
	    for (WebElement each : elements) {
	    	String text = each.getText();
	    	String replaceAll = text.replaceAll(",", "");
	    	
	   // 	List<Integer> elements=new ArrayList<Integer>();
			//System.out.println(text);
	    	int mobile = Integer.parseInt(replaceAll);
	    	//elements.add(mobile);
	    	
			
		}
	 //  Collections.sort(elements);
	   System.out.println(elements);
		
		
	}
	
	
}



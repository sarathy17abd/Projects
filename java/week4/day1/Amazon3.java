package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement each : findElements) {
			String text = each.getText();
			//System.out.println(text);
			String replaceAll = text.replaceAll(",", "");
			int mobile = Integer.parseInt(replaceAll);
			list.add(mobile);
		}
		Collections.sort(list);
		System.out.println(list);
		
		
		}

}

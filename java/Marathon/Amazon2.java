package Marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//search phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//empty list
		List<Integer> list=new ArrayList<Integer>();
		for (WebElement each : findElements) {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");//6799
			//System.out.println(text);
			int mobile = Integer.parseInt(replaceAll);
			list.add(mobile);
			
		}
		//sort the list
		Collections.sort(list);
		System.out.println(list);
	}

}

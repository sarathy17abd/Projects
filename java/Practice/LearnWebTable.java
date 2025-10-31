package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.leafground.com/table.xhtml;jsessionid=node0zgvq4cfbwf3o1j7ieuoma36s17252347.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		 WebElement element = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		 
		 List<WebElement> rowcount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr"));
		 int size = rowcount.size();
		 System.out.println(size);
		 
		 List<WebElement> column = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));
		 int size2 = column.size();
		 System.out.println(size2);
		 
		 List<WebElement> allData = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr/td"));
		 
		// for (WebElement webElement : allData) {
		//System.out.println(webElement.getText());
		//}
		 
		 for (int i = 1; i <= rowcount.size(); i++) {
			 driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td"));
			 System.out.println("--------------");
			 for (int j = 1; j < column.size(); j++) {
				 WebElement element2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]/tbody/tr["+i+"]/td["+j+"]"));
				 System.out.println(element2.getText());
				 
				
			}
			 
			 
			
		}
		 
		 
	}

}

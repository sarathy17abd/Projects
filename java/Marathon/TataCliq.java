package Marathon;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement mH = driver.findElement(By.xpath("(//div[@role='button'])[8]"));
		Actions act=new Actions(driver);
		act.moveToElement(mH).perform();
		
		WebElement element = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		act.moveToElement(element).perform();
		element.click();
		
	    driver.findElement(By.xpath("//div[@class='DesktopHeader__brandsDetails']")).click();
	    
	    WebElement element2 = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
	    Select select=new Select(element2);
	    select.selectByIndex(3);
	    
	    driver.findElement(By.xpath("//div[text()='Men']")).click();
	    Thread.sleep(2000);
	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
	    System.out.println("The price of all watches are:");
	    
	    for (WebElement iter : elements) {
			System.out.println(iter.getText());
		}
	    
	    String text = driver.findElement(By.xpath("(//h3[@class='ProductDescription__boldText'])[2]")).getText();
	    System.out.println("The price of the first watch is="+text);
	    
	    String secondprice = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder'])[2]")).getText();
	    System.out.println("Price of second watch is="+secondprice);
	    
	    
	    Actions Act=new Actions(driver);
	     WebElement sD = driver.findElement(By.id("ProductModule-MP000000027635261"));
	     Act.scrollToElement(sD).perform();
	     sD.click();
	     
	     Set<String> Parentwindow = driver.getWindowHandles();
	     List<String> Childwindow=new ArrayList<String>(Parentwindow);
	     
	     driver.switchTo().window(Childwindow.get(1));
	     driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	     
	     String text2 = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
	     System.out.println("Item in cart="+text2);
	     
	     if (text.contains(secondprice)) {
			System.out.println("Both prices are same");
		}
	    
	    driver.close();
	    driver.quit();
	}
	
}


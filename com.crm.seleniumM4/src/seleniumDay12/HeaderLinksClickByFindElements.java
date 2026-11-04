package seleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderLinksClickByFindElements {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	        
	        	String url =	"https://demowebshop.tricentis.com/";
	        	driver.get(url);
	        
	        List <WebElement> footer_links = driver.findElements(By.cssSelector(".follow-us>ul>li>a"));
	        		for(int i =0 ; i<footer_links.size() ;i++) {
	        			footer_links = driver.findElements(By.cssSelector(".follow-us>ul>li>a"));
	        			Thread.sleep(2000);
	        			footer_links.get(i).click();
	        			Thread.sleep(2000);
	        			driver.navigate().to(url);
	        			Thread.sleep(2000);
	        		}
	        		driver.quit();
		}
}

package seleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderPagebyfindElements {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	        
	        driver.get("https://demowebshop.tricentis.com/");
	        
	        List<WebElement> headerElements =driver.findElements(By.cssSelector(".header-links>ul>li>a"));
	        for (WebElement buttons : headerElements) {
				Thread.sleep(2000);
	        		buttons.click();
	        		Thread.sleep(2000);
	        		driver.navigate().back();
	        		Thread.sleep(2000);
			}
	        
	        driver.quit();
		}
}

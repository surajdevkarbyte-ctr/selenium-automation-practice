package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTraversing {
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			// PARENT CHILD TRAVERSINNG 
		//	driver.findElement(By.cssSelector(".block.block-poll>.title>strong")) ;
			
			// NTH CHILD TRAVERSING
			driver.findElement(By.cssSelector(".poll-options>li:nth-child(3)")).click();
			
			
			
			driver.quit();
			
			
		}
}

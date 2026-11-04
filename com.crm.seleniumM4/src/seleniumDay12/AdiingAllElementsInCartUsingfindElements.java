package seleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdiingAllElementsInCartUsingfindElements {
		public static void main(String[] args) throws InterruptedException {
			 ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		        
		        driver.get("https://demowebshop.tricentis.com/");
		        String Current_page_url = driver.getCurrentUrl();
		        System.out.println("The Page Current URL IS :"+Current_page_url);
		        
		        driver.findElement(By.xpath("//div[@class='header-menu']//ul[1]/li[5]/a")).click();
		        
		        String Title_of_PAge = driver.getTitle();
		        System.out.println("Title of Current page is :"+Title_of_PAge);
		        
		        List<WebElement> addtocart =driver.findElements(By.xpath("//input[@value='Add to cart']"));
		        		for (WebElement button : addtocart) {
							button.click();
							Thread.sleep(2000);	
						}
		        	
		        	Thread.sleep(5000);
		        	driver.findElement(By.xpath("//span[@class='cart-label' and text()='Shopping cart']")).click();
		        	List<WebElement> removeproduct =driver.findElements(By.xpath("//input[@name='removefromcart']"));
		        		for (WebElement checkbox : removeproduct) {
							checkbox.click();
							Thread.sleep(2000);
						}
		        	driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		        	
		        	driver.quit();
		        		
						
			System.out.println("Task Completed");		
		}
}

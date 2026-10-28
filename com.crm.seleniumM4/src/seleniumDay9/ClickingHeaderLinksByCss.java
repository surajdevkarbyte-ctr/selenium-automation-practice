package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingHeaderLinksByCss {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".header-links-wrapper>.header-links>ul>li>.ico-register")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.findElement(By.cssSelector(".header-links-wrapper>.header-links>ul>li>.ico-login")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.cssSelector(".header-links-wrapper>.header-links>ul>li>a>.cart-label")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		driver.findElement(By.cssSelector(".header-links-wrapper>.header-links>ul>li>.ico-wishlist>.cart-label")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("Task completed");
		
		
	}
}

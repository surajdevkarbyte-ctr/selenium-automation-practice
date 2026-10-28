package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPoleBycssTransversing {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".poll>ul>li>#pollanswers-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".poll>ul>li>#pollanswers-2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".poll>ul>li>#pollanswers-3")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".poll>ul>li>#pollanswers-4")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("task completed");
	}
}

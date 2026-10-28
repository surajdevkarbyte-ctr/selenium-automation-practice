package selenium241026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("pollanswers-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(2000);
		
		System.out.println("Task completed");
		
		driver.close();
		
	}

}

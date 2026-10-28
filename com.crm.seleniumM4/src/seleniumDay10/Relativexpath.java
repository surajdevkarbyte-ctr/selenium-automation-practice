package seleniumDay10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//x path by attribute
		
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		// x path by group of index 
		
		driver.findElement(By.xpath("(//input[@name='pollanswers-1'])[2]")).click();
		Thread.sleep(2000);
		
		// x path by text method 
				// We need to gives exact text if text contains spaces they also count like values /n  so that not works 
		driver.findElement(By.xpath("//strong[text()='Community poll']"));
		Thread.sleep(2000);
		
		// x path by tag name 
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("CarryMinati");
		Thread.sleep(2000);
		
		// x path by Contains text 
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Thread.sleep(2000);
		
		// x path contains of Attribute 
		driver.findElement(By.xpath("(//input[contains(@id,small-searchterms)])[1]")).sendKeys("Computer");
		Thread.sleep(2000);
		
		System.out.println("Task completed ");
	}
}

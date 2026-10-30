package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chainedxpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='header-menu']/ul/li/a)[2]")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		// Whenever the element dosn't contain any attribute we go for chained x path in that we wrie x path for parent.
		//and after we add a forword slash to locate the element .   
		
	}
}

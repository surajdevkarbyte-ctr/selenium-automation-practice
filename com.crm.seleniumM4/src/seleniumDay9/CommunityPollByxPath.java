package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPollByxPath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/ul/li/input)[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/ul/li/input)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/ul/li/input)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/ul/li/input)[1]")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("task completed");
		
	}
}

package seleniumDay9;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPagesByxpath {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/ul/li[1])[1]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/li[4]/a")).click();
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/li[5]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body/div/div/div/div/div/div/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("task completes");
		
	}
}

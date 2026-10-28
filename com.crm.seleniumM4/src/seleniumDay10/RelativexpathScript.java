package seleniumDay10;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativexpathScript {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(2000);
		

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Your Email");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("your password");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//input[@type='button'])[4]")).click();
		
		driver.get("https://demowebshop.tricentis.com/5-virtual-gift-card");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Suraj Devkar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("xyz@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Pleace carry carefully the product");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("2");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Shopping')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("TASK completed");

	}

}

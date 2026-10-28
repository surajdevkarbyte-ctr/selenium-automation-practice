package selenium241026;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("forcheckbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("akshay");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Patil");
		Thread.sleep(2000);
		
		String email = "akshay"+(int)(Math.random()*100000)
				+ "@gmail.com";
		driver.findElement(By.name("Email")).sendKeys(email);
		Thread.sleep(2000);
		
		driver.findElement(By.name("Password")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.name("ConfirmPassword")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		
		driver.close();
		
		System.out.println("Task has been Completed");
		

	}

}

package seleniumDay11;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByOperator {
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			driver.get("https://demowebshop.tricentis.com/");
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='pollanswers-1' and @id='pollanswers-3']")).click();
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='price actual-price' and text()='25.00']")).click();
			//Thread.sleep(2000);
			driver.quit();
			//Thread.sleep(2000);
			System.out.println("Taskkk Complete");
			
		}
}

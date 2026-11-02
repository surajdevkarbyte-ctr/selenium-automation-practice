package seleniumDay11;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentNavigateMethods {
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.get("https://www.redbus.in/");
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.navigate().to("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.quit();
				
				System.out.println("Task completed");
				
			}
}

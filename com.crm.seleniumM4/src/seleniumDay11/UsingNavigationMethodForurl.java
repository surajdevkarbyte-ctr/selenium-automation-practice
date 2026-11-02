package seleniumDay11;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethodForurl {
			public static void main(String[] args) throws InterruptedException, MalformedURLException {
				ChromeDriver driver = new ChromeDriver();
		
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.get("https://www.redbus.in/");
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				// URL(String) constructor deprecated in java 20 insted we use URI.create(Sting )
				// its deprecated because of Its parsing behavior can be inconsistent.
				
				URL myurl = new URL("https://www.amazon.in/");
				driver.navigate().to(myurl);
				
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

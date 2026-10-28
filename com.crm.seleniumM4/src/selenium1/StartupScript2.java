package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScript2 {
	public static void main(String[] args) throws InterruptedException {
		// open a browser
		ChromeDriver driver = new ChromeDriver();
		// maximise thre browser
		driver.manage().window().maximize();
		// go to website
		driver.get("https://chat.qspiders.com/");
		
		Thread.sleep(2000);
		// go to another website we insert on same page
		driver.navigate().to("https://www.selenium.dev/");
		
		Thread.sleep(2000);
		// go back to previous page
		driver.navigate().back();
		
		Thread.sleep(2000);
		// after that refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		// go to the forword
		driver.navigate().forward();
		
		Thread.sleep(2000);
		// end the settion
		driver.close();
		
		
		
	}
}

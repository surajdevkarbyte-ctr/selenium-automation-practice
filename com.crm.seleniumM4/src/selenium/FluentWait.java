package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			
}
}

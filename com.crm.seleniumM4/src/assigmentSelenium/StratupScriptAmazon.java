package assigmentSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class StratupScriptAmazon {
			public static void main(String[] args) {
				ChromeDriver  driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(null);
				driver.quit();
			}
}

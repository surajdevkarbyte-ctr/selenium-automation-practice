package assigmentSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScriptTvs {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tvsmotor.com/");
			driver.quit();
		}
}

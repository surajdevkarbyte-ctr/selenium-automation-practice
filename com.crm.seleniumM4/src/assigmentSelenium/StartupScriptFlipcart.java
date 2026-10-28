package assigmentSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScriptFlipcart {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate();
		driver.close();
		
	}

}

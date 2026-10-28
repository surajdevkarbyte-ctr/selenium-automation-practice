package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;


public class First {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		System.out.println("task complete");

	}

}

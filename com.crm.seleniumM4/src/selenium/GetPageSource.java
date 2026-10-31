package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	 public static void main(String[] args) {

	       ChromeDriver driver = new ChromeDriver();

	        driver.get("https://demowebshop.tricentis.com/");

	        String source = driver.getPageSource();

	        System.out.println(source);

	        driver.quit();
	    }
}

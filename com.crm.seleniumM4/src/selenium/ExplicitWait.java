package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
		public static void main(String[] args) {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/");
			
			//Explicit wait
			WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
			WebElement username =mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"small-searchterms\"]")));
			
			username.sendKeys("Computer");
			
			driver.quit();
			
		}
} 

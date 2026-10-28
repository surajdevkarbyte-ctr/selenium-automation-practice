package Aassignment231026;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class questtion1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		WebElement rige=driver.findElement(By.className("block w-full h-full"));
		rige.click();
		driver.close();
		
	}

}

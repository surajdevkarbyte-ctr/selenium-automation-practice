package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/ul/li[3]/a")).click();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
	//	String currenturl = driver.getCurrentUrl();
		//System.out.println(currenturl);
		//https://testautomationpractice.blogspot.com/
		
	/*	String getpagesource = driver.getPageSource();
		System.out.println(getpagesource);
		//return source code 
		*/
		
	/*	String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		641D20CD91D8B05A462EE3EC123F2695
		
		*/
		
		Set<String> windowhandles  =driver.getWindowHandles();
		System.out.println(windowhandles);
		driver.quit();
		
		
	}

}

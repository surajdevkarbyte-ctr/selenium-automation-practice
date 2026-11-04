package seleniumDay12;



import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;



public class WebDriverMethods {
		public static void main(String[] args) {
			 ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		        
		        driver.get("https://demowebshop.tricentis.com/");
		        
		        String dws_url =driver.getCurrentUrl();
		        System.out.println("URL of current Page: "+dws_url);
		        System.out.println("Source code of Current page /n :"+driver.getPageSource());
		        
		     /*   driver.get("https://www.youtube.com/");
		        String youtube_title = driver.getTitle();
		        System.out.println("Youtube title :"+youtube_title);
		        */
		        
		        driver.quit();
		        
		}
}

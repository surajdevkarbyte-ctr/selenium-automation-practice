package seleniumDay12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionOnMultipleElementUsingFindElements {
			public static void main(String[] args) {
				 ChromeDriver driver = new ChromeDriver();
			        driver.manage().window().maximize();
			        
			        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			        
			        driver.get("https://demowebshop.tricentis.com/");
			        
			        // by using common Attribute
			        
			 /*      List<WebElement> polls=driver.findElements(By.name("pollanswers-1"));
			       for (WebElement poll : polls) {
			    	   		poll.click();
					
				   }
			  */
			        
			        //by using traversing
			        List<WebElement> polls=driver.findElements(By.cssSelector(".poll-options>li>input"));
				       for (WebElement poll : polls) {
				    	   		poll.click();
						
					   }
			        
			       driver.quit();
			       
			       System.out.println("Task Complete");
			}
}


/* 
 * 1)wrsript for adding all prodocts of digital download page inside in the cart using find elements
 * open-max- enter tws homepage - get the url display console- click digital download -get title and displaye -
 * add all the products to shopping cart by using find elements - remove all the product by find elements close the browser 
 * 
 * 
 * 2) WSF FOR ALL THE LINKS PRESENT IN THE HEADER PAGE 
 * OPEN-MAX- ENTER INTO DWS PAGE - CLICK LINKS LIKE REGESTER LOG IN SHOOPING CART AND WISHLIST BY USING FIND ELEMENT - CLOSE THE BROWSER
 * */

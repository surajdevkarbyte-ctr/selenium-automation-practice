package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScript {
	public static void main(String[] args) throws InterruptedException {
		// oprn the browser
		ChromeDriver driver = new ChromeDriver();
		// maximise the browser window
		driver.manage().window().maximize();
		// enter url of webpage
		//driver.get("https://www.shopify.com/in/free-trial?term=shopify&adid=769590480457&campaignid=22900772093&branded_enterprise=1&BOID=brand&utm_medium=cpc&utm_source=google&matchtype=e&network=g&gad_source=1&gad_campaignid=22900772093&gbraid=0AAAAAC3QZJoXZTPTTudw4Q5gY5MIabNYR&gclid=Cj0KCQjwnIDUBhDrARIsAJDGwStZTAV_iZB4Dm0Vzf44jVpFHPeUqbAw6vhhzBBkzgFfk8Zcy33VstMaAtxWEALw_wcB");
		driver.navigate().to("https://chat.qspiders.com/");
		Thread.sleep(2000);
		// close
		//driver.close();
		driver.quit();
		
	}

}

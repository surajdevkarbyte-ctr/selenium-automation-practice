package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class StratupScript3 {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chat.qspiders.com/");
		
		// For grtting url
		String Current_url =driver.getCurrentUrl();
		System.err.println("Current url" + Current_url );
		
		//for getting title
		String title =driver.getTitle();
		System.out.println("title of page :"+title);
		
		// for getting source code
		String sourcecode=driver.getPageSource();
		System.out.println("Page source code :"+sourcecode);
		
		
		driver.close();
	}
	
	//Assignmet 1) wsf startup script steps :- 1 open browser 2. maximise the bro - 3 enter into one page 4- close the browser 5 diifferent pages mix car,bike , do same steps 
    // wsf getting the url title , pagesource and naviagte actions 1 . open the browser 2. maximise the browser 3. enter into redbus bus page 4 get the url 5 naviagte to amazone page then get the title of page go back to redbus page get sourcecode of the page move to the amzon page after moving perform refresh close the browser
}

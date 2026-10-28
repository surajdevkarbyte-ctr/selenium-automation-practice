
package seleniumDay8;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterScript1 {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.ico-register")).click();

        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".forcheckbox")).click();

        driver.findElement(By.cssSelector("#FirstName")).sendKeys("Akshay");

        driver.findElement(By.cssSelector("#LastName")).sendKeys("Patil");
        String email = "akshay"
                + System.currentTimeMillis()
                + "@gmail.com";

        driver.findElement(By.cssSelector("input[name='Email']")).sendKeys(email);
        driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("Test@123456");
        driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("Test@123456");
        driver.findElement(By.cssSelector("#register-button")).click();

        Thread.sleep(2000);

        driver.close();

        System.out.println("Registration script executed.");

    }
}

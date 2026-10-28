package seleniumDay8;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a.ico-login")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#Email")).sendKeys("suraj123@gmail.com");
        driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("12345");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.login-button")).click();
        Thread.sleep(2000);
        System.out.println("completed");
        driver.quit();
    }
}
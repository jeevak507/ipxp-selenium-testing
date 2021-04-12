package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\D k\\Documents\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.radiusagent.com/");
	    
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jeevak@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//a[text() ='Forgot password?']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jeevak@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.navigate().back();
		driver.findElement(By.className(".icon-ic_chat_icon")).click();
		driver.findElement(By.xpath("//div[@aria-label= 'Close widget']")).click();
		driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		driver.findElement(By.xpath("//a[text()='Log In']")).click();
		driver.findElement(By.cssSelector(" img[alt*=\"Apple Login\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//button[text()='Sign in with Google']")).click();
		driver.quit();
		
		
	}
}

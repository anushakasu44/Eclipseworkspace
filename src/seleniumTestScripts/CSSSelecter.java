package seleniumTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelecter {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// TODO Auto-generated method stub

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("anu");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("jcshd");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.quit();
	}

}

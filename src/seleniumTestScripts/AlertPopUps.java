package seleniumTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://learn.letskodeit.com/p/practice");
		    driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Alert");
		    Thread.sleep(5000);
		    driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		    Alert act=driver.switchTo().alert();
		   System.out.println(act.getText()); 
		   act.dismiss();
		   
		   driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Confirm");
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		   Alert act1=driver.switchTo().alert();
		   System.out.println(act1.getText());
		   act1.dismiss();
		   
		   driver.quit();
	}

}

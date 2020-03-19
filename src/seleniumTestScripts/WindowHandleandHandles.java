package seleniumTestScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleandHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();

            driver.findElement(By.xpath("//a[text()='Instagram']")).click();
		    driver.findElement(By.xpath("//a[text()='Cookies Policy']")).click();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
		 String parentwindow= driver.getWindowHandle();//handles single window.
		 System.out.println(parentwindow);//it generates unique session id
		 
		 
		 Set<String> windows=driver.getWindowHandles();//handles multiple windows
		 for(String window:windows) { //Set does not allows dublicates and indexing.so for-eachloop:it iterates each window and store it in x variable.
		 System.out.println(window);
		 driver.switchTo().window(window);
		 System.out.println(driver.getTitle());
		 if(driver.getTitle().equals("Instagram")) {
			driver.findElement(By.xpath("//button[text()='Log in with Facebook']")).click();
			break;
		 }
		 }
		 driver.close();
		 driver.switchTo().window(parentwindow);
		WebElement facebook= driver.findElement(By.name("email"));
		 facebook.sendKeys("anushakasu44");
		 Thread.sleep(5000);
	boolean bool=	 facebook.isDisplayed();
	System.out.println(bool);
		 
		 
		 
		    driver.quit();
	}

}

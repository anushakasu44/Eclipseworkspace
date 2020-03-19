package seleniumTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://learn.letskodeit.com/p/practice");
		    driver.manage().window().maximize();

		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement mouse= driver.findElement(By.xpath("//button[text()='Mouse Hover']"));
         Actions act=new Actions(driver);
         act.moveToElement(mouse).perform();
         
//       WebElement top=  driver.findElement(By.xpath("//a[text()='Top']"));
//       top.click();
//     boolean bool=  top.isDisplayed();
//       System.out.println(bool);
       
        
//        WebElement Reload= driver.findElement(By.xpath("//a[text()='Reload']"));
//         Reload.click();
//         Boolean bool1=Reload.isDisplayed();
//         System.out.println(bool1);
//         
           act.contextClick().build().perform();
           act.doubleClick().build().perform();
         driver.quit();


}
}

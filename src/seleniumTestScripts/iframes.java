package seleniumTestScripts;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		 WebElement F1= driver.findElement(By.xpath("//iframe[@id='frame1']"));
		    driver.switchTo().frame(F1);
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		  // System.out.println(F1.getAttribute("value")); //to get already stored value "testing" from the textbox.
		    
		   WebElement F3= driver.findElement(By.xpath("//iframe[@id='frame3']"));
		    driver.switchTo().frame(F3);
		    driver.findElement(By.xpath("//input[@id='a']")).click();
		    
		    driver.switchTo().parentFrame(); //F1 frame
		    driver.switchTo().defaultContent();// comes to the pagelevel from frame
		    
		  WebElement F2=  driver.findElement(By.xpath("//iframe[@id='frame2']"));
		    driver.switchTo().frame(F2);
		   WebElement dropdown= driver.findElement(By.xpath("//select[@id='animals']"));
		   Select sel=new Select(dropdown);
		   sel.selectByValue("babycat");
		   
		    driver.quit();
		    
		    
		    
		    
	}

}

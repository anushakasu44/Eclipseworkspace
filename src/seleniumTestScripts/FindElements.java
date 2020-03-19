package seleniumTestScripts;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("http://demo.guru99.com/test/newtours/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		    
		   List<WebElement> links= driver.findElements(By.xpath("//a"));
		   System.out.println(links.size());
		   for(int i=0;i<links.size();i++) {
			   if(links.get(i).getText().equalsIgnoreCase("cruises")){
				   links.get(i).click();
				   System.out.println("clicked");
				   driver.findElement(By.xpath("//input[contains(@type,'te')]")).sendKeys("anu123");
				   driver.findElement(By.xpath("//input[starts-with(@type,'pass')]")).sendKeys("anu123");
				   driver.findElement(By.cssSelector("input[type='submit']")).click();
				  

				   
			   }
			   
		
			}
			
	
		driver.quit();
}
	
}
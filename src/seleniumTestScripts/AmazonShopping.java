package seleniumTestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonShopping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

	//GET 	
		//driver.get("https://www.facebook.com/");
//driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//NAVIGATE
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("womenshoes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='PUMA']")).click();
		List<WebElement> shoes=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		System.out.println(shoes.size());
		for(int i=0;i<shoes.size();i++) {
			if(shoes.get(i).getText().equals("PUMA Women's Vikky Sneaker")) {
				shoes.get(i).click();
				
				break;
			}
		}
		Thread.sleep(5000);
		
		
	
//		WebElement size=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
//		Select sel=new Select(size);
//		sel.selectByIndex(1);
//		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
//		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("anushakasu44@gmail.com");
//		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
driver.quit();
	}

}

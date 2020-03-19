package AutoITScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://tinyupload.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
		
		//To call AutoIT Script into this selenium
		Runtime.getRuntime().exec("D:\\Autoitscript.exe");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@name='file_description']")).sendKeys("excel file");
		driver.findElement(By.xpath("//img[@alt='Upload']")).click();
		
		driver.quit();
		
	}

}

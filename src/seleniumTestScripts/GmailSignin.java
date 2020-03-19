package seleniumTestScripts;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GmailSignin {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://accounts.google.com/signin");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("anushakasu44@gmail.com");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Greenfr0g");
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    driver.quit();
		}

	}



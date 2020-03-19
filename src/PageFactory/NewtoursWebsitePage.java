package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursWebsitePage {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Homepage home=new Homepage(driver);
		home.enterUsername("anushakasu44");
		home.enterPassword("anushakasu");
		
		FlightsPage fp=home.ClickOnFlights();
		fp.clickOnoneway();
		fp.selectPassengers();
		
		driver.quit();
	
	
	}

}

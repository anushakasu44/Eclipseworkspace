package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursWebsitePage {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	NewtoursHomePage home=new NewtoursHomePage(driver);
//	home.clickOnSUPPORT();
//	driver.navigate().back();
	
	NewtoursRegisterPage page=home.clickOnREGISTER();
	page.typefirstName("anusha");
	page.typelastName("Reddy");
	page.typePhone("43862566");
	page.selectCountry();
	
	
	driver.quit();
	
	
	
	}

}

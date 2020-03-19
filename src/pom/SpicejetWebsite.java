package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SpicejetWebsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

SpiceJetHomePage home=new SpiceJetHomePage(driver);
home.clickOnRoundtrip();
Thread.sleep(2000);
home.from(driver);
home.clickOnAdult(driver);
//home.clickOnChild();


driver.quit();

	}

}

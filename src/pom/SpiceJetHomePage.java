package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SpiceJetHomePage {

	ChromeDriver driver;
	private WebElement Roundtrip;
	private WebElement From;
	private WebElement Arrival;
	private WebElement Adult;
	private WebElement Child;
	
	
	
	
	
	
	public SpiceJetHomePage(ChromeDriver driver){
		this.driver=driver;
		
		Roundtrip=driver.findElement(By.xpath("//input[@value='RoundTrip']"));
	//From= driver.findElement(By.xpath("//table[@id='citydropdown']//li//a[text()='Hyderabad (HYD)']"));
		Adult=driver.findElement(By.xpath("//div[text()='1 Adult']"));
		Child=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Infant']/.//option[@value='4']"));
	}
	
public  void from(ChromeDriver driver) {
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
List<WebElement> city=	driver.findElements(By.xpath("//table[@id='citydropdown']//li"));
System.out.println(city.size());
//System.out.println(city.get(5).getText());


		for(int i=0;i<city.size();i++) {
			if(city.get(i).getText().equalsIgnoreCase("Hyderabad (HYD)")) {
			city.get(i).click();
			System.out.println(city.get(i).getText());
			break;
		}
		}
}

public  void To(ChromeDriver driver) {
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
List<WebElement> city1=	driver.findElements(By.xpath("//table[@id='citydropdown']//li"));
System.out.println(city1.size());
//System.out.println(city.get(5).getText());


		for(int i=0;i<city1.size();i++) {
			if(city1.get(i).getText().equalsIgnoreCase("Hyderabad (HYD)")) {
			city1.get(i).click();
			System.out.println(city1.get(i).getText());
			break;
		}
		}
}
//		WebElement	From=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
//		From.sendKeys("Hyderabad (HYD)");
//		From.click();
//		}
	
	public  void Arrival(ChromeDriver driver) {
		WebElement	to=driver.findElement(By.xpath("//input[@id=ctl00_mainContent_ddl_destinationStation1_CTXT']"));
		to.sendKeys("Goa (GOI))");
		to.click();}
	
	public void date(ChromeDriver driver) {
		WebElement date=driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']"));
		date.click();
	}
	
	public void clickOnRoundtrip() {
		Roundtrip.click();
	}
	public void clickFrom() {
		From.click();
	}
	
	
	public void clickOnAdult(ChromeDriver driver) {
			driver.findElement(By.xpath("//div[text()='1 Adult']")).click();
		//WebElement	pass=driver.findElement(By.xpath("//div[text()='1 Adult']/.//select[@name='ctl00$mainContent$ddl_Adult']/.//option[@value='4']"));
	WebElement adu=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']"));
	Select sel=new Select(adu);
	sel.selectByVisibleText("4");
	}
	
	public void clickOnChild() {
		Child.click();
	}

}

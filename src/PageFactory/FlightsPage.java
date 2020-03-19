package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsPage {

	
ChromeDriver driver;

@FindBy(xpath="//input[@value='oneway']")
WebElement oneway;

@FindBy(xpath="//select[@name='passCount']/. //option[@value='2']")//used for find elements
WebElement Passengers;

public FlightsPage(ChromeDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void clickOnoneway() {
	oneway.click();
}

public void selectPassengers() {
	Passengers.click();
}
	}



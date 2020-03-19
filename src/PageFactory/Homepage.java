package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	
ChromeDriver driver;


@FindBy(xpath="//input[@name='userName']")
WebElement userName;

@FindBy(xpath="//input[@name='password']")
WebElement password;

@FindBy(xpath="//a[text()='Flights']")
WebElement Flights;

//@FindBy(xpath="")
		

public Homepage(ChromeDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void enterUsername(String data) {
	userName.sendKeys(data);
}
public void enterPassword(String data) {
	password.sendKeys(data);
}

public FlightsPage ClickOnFlights() {
	Flights.click();
	return new FlightsPage(driver);
}


}
	



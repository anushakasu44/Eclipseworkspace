package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewtoursRegisterPage {

	ChromeDriver driver;
	 private WebElement firstName;
	 private WebElement lastname;
	 private WebElement Phone;
	 private WebElement Country;
	 
	 
	public NewtoursRegisterPage(ChromeDriver driver) {
		this.driver=driver;
		firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
		lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
		Phone=driver.findElement(By.xpath("//input[@name='phone']"));
		Country=driver.findElement(By.xpath("//select[@name='country']/.//option[@value='ALGERIA']"));
		
	 }
 
	 public void typefirstName(String data) {
		 firstName.sendKeys(data);
	 }
	 
	 public void typelastName(String data) {
		 lastname.sendKeys(data);
		 
	}
	 public void typePhone(String data) {
		 Phone.sendKeys(data);
}
	 
	 public void selectCountry() {
		 Country.click();
	 }
	 
	
//	 public void selectCountry(ChromeDriver driver) {
//		WebElement Country= driver.findElement(By.xpath("//select[@name='country']"));
//		 Select sel=new Select(Country);
//		sel.selectByValue("ALGERIA");
//		
	 }

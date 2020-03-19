package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursHomePage {
	
	ChromeDriver driver;
	
	private WebElement SIGHON; //Declaration of web elements
	private WebElement REGISTER;
	private WebElement SUPPORT;
	private WebElement CONTACT;
	
	public NewtoursHomePage(ChromeDriver driver) {//Initiliazation
		this.driver=driver;
		SIGHON=driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
		REGISTER=driver.findElement(By.xpath("//a[text()='REGISTER']"));
		SUPPORT=driver.findElement(By.xpath("//a[text()='SUPPORT']"));
		CONTACT=driver.findElement(By.xpath("//a[text()='CONTACT']"));
		
	}
	
	public void clickOnSIGHON() {//Reusable methods
		SIGHON.click();
	}
	
	public NewtoursRegisterPage clickOnREGISTER() {
		REGISTER.click();
		return new NewtoursRegisterPage(driver);
		}
	
	public void clickOnSUPPORT(){
		SUPPORT.click();
	}
	
	public void clickOnCONTACT() {
		CONTACT.click();
	}
	


	}



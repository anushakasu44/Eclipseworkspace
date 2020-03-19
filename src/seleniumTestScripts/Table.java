package seleniumTestScripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.get("https://learn.letskodeit.com/p/practice");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    //scenario::Finding table data(TD):JavaScript Programming Language//
		 List<WebElement> th=   driver.findElements(By.xpath("//table/tbody/tr/th"));//displaying all columns
		System.out.println(th.size()); 
		
		 List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));//displaying all rows
		 System.out.println(rows.size());//it displays 4 but actual rows should be 3 without header(minus 1)
		 
		 int index=0;//list index starts from 0 
		 for(int i=1;i<=th.size();i++) {//here i=1, bcoz table index start from 1 so we give i-1 in next line to match index
			 if(th.get(i-1).getText().equalsIgnoreCase("Course")) {
				 index=i;
				 break;
			 }
		 }
		 WebElement data=driver.findElement(By.xpath("//table/tbody/tr[4]/td["+index+"]"));
		 System.out.println(data);
		 System.out.println(data.getText());
		 driver.quit();
		 
	}

}

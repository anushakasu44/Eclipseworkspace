package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragabbleJquary {
ChromeDriver driver;
private WebElement dragmearound;

	public void dragmearound(ChromeDriver driver) {
		this.driver=driver;
		 dragmearound=driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(dragmearound, 60, 20).release(dragmearound).build().perform();
		
	}
}

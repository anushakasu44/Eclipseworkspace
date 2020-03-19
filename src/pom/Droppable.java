package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	ChromeDriver driver;
	private WebElement drag;
	private WebElement drop;

		public void DragAnddrop(ChromeDriver driver) {
			this.driver=driver;
			drag=driver.findElement(By.xpath("//div[@id='draggable']"));
			drop=driver.findElement(By.xpath("//div[@id='droppable']"));
			Actions act=new Actions(driver);
			
			act.dragAndDrop(drag, drop).build().perform();
			
		}
}

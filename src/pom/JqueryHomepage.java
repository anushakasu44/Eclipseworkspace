package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryHomepage {

	ChromeDriver driver;
	private WebElement Draggable;
	private WebElement Droppable;
	private WebElement Resizable;
	private WebElement Selectable;
	private WebElement Sortable;


public JqueryHomepage(ChromeDriver driver) {
	this.driver=driver;
	Draggable=driver.findElement(By.xpath("//a[text()='Draggable']"));
	Droppable=driver.findElement(By.xpath("//a[text()='Droppable']"));
}


public DragabbleJquary clickOnDraggable() {
	Draggable.click();
	return new DragabbleJquary();
}
public Droppable clickOnDroppable() {
	Droppable.click();
	return new Droppable();
	
}
}
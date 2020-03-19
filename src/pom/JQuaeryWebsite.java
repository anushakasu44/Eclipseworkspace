package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class JQuaeryWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		JqueryHomepage hp= new JqueryHomepage(driver);
		//DragabbleJquary drag=hp.clickOnDraggable();
		//drag.dragmearound(driver);
		Droppable dp=hp.clickOnDroppable();
		dp.DragAnddrop(driver);
		
		driver.quit();
		
	}

}

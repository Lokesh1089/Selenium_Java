package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Droppable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		driver.findElement(By.xpath("//a[@href='pages/drop.html']")).click();
		
		Thread.sleep(1000);
		
		//***Task: Drag me to my target
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions dropAction = new Actions(driver);
		//by using actions
		//dropAction.clickAndHold(source).moveToElement(target).release(source).build().perform();
		//By using drag and drop method
		dropAction.dragAndDrop(source, target).build().perform();
		Thread.sleep(2000);
		driver.close();
	}

}

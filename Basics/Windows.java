package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		
		driver.findElement(By.xpath("//a[@href='pages/Window.html']")).click();
		Thread.sleep(1000);
		
		//***Task: 	Click button to open home page in New Window	
		
		driver.findElement(By.id("home")).click();
		// Web handles will return unique window address in set of string object 
		Set <String> windowHandler = driver.getWindowHandles();
		// iterator will help to iterate a specific window to do actions ( no indexes in windows)
		Iterator <String> windowIterator = windowHandler.iterator();
		// to get parent window address
		String parentWindow = windowIterator.next();
		System.out.println("Parent window address : "+parentWindow);
		//child window address
		String childWindow = windowIterator.next();
		driver.switchTo().window(childWindow);
		System.out.println("Child window address : " +childWindow);
		Thread.sleep(1500);
		driver.close();
		// back to parent window to do other tasks
		driver.switchTo().window(parentWindow);
		
		//***Task: Find the number of opened windows
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		
		Set<String> windowHandler2 = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(windowHandler2);
		System.out.println("Number of opened windows: " + tabs.size());
		
		driver.quit();
		
		// o/p
		
		/*
		Parent window address : CDwindow-9093094639B492BA3DAFA9318D0E340E
		Child window address : CDwindow-5E5C550B45F2083F20B24FE9E408ACB5
		Number of opened windows: 3
		*/
	
		// To close child window one by one
		
//		Iterator <String> windowIterator2 = windowHandler2.iterator();
//		String parentWindow2 = windowIterator2.next();
//		System.out.println("Parentwindow Two : " +parentWindow2);
//		String childWindowOne = windowIterator2.next();
//		System.out.println("Child window one address : " +childWindowOne);
//		driver.switchTo().window(childWindowOne);
//		Thread.sleep(1000);
//		driver.close();
//		driver.switchTo().window(parentWindow2);
//		driver.switchTo().window(childWindowOne);
//		Thread.sleep(1000);
//		driver.close();
//		driver.switchTo().window(parentWindow2);
//		Thread.sleep(1000);
	
		
	
	}

}

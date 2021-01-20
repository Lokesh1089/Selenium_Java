package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com");
		
		driver.findElement(By.xpath("//a[@href='pages/Calendar.html']")).click();
		Thread.sleep(1000);
		
		//***Task: Select 10th day of following month
		WebElement calendarField = driver.findElement(By.id("datepicker"));
		// giving date by using send keys
		//calendarField.sendKeys("02/10/2021");
		calendarField.click();
		//selecting date by using xpath
		driver.findElement(By.xpath("//a[@title='Next']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'10')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
		
	}

}

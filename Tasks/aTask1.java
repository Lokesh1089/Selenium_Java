package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		// Edit
		
		//driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("mockmail@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("Hey hi !");
		Thread.sleep(2000);
		driver.navigate().back();
		
		// Button
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"home\"]")).click();
		
		//Hyper Text
		Thread.sleep(2000);
		driver.findElement(By.linkText("HyperLink")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		
		// Getting error 404 status page tile 
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//getting back to home page
		driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(2000);
		
		//closing the browser
		driver.close();
		
		
				
	
	
	}

}

package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		// Edit --> 1
		
		driver.findElement(By.xpath("//h5[@class='wp-categories-title']")).click();
		Thread.sleep(2000);
		//input for email field
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mockmail@gmail.com");
		Thread.sleep(2000);
		// Append a text and press keyboard tab
		WebElement appendTAB = driver.findElement(By.xpath("//input[@value='Append ']"));
		appendTAB.sendKeys("Hey hi");
		String appendVal = appendTAB.getAttribute("value");
		System.out.println("appending input with existing value: " +appendVal);
		Thread.sleep(1000);
		appendTAB.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//Get default text entered
		WebElement defaultfield = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String val = defaultfield.getAttribute("value");
		System.out.println("Default value from the field: " +val);
		//Clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Thread.sleep(2000);
		//Confirm that edit field is disabled
		WebElement check = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
		if (check.isEnabled()){
			System.out.println("Confirmed!. Field is Disabled");
			
		} else {
			System.out.println("Field is enable");
		}
		Thread.sleep(1000);
		driver.navigate().back();
		
		// Button --> 2
		
		driver.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
		Thread.sleep(2000);
		// clicking on go to home page button 
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		//Hyper Text --> 3
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
		Thread.sleep(2000);
		// clicking on "Verify am I broken?" hyperlink text
		driver.findElement(By.xpath("//a[@href='error.html']")).click();
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

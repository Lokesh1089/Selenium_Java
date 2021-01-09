package test;

import java.awt.Dimension;
import java.awt.Point;

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
		//***Task: input for email field
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mockmail@gmail.com");
		Thread.sleep(2000);
		//***Task: Append a text and press keyboard tab
		WebElement appendTAB = driver.findElement(By.xpath("//input[@value='Append ']"));
		appendTAB.sendKeys("Hey hi");
		String appendVal = appendTAB.getAttribute("value");
		System.out.println("After Append: " +appendVal);
		Thread.sleep(1000);
		appendTAB.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		//***Task: Get default text entered
		WebElement defaultfield = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String val = defaultfield.getAttribute("value");
		System.out.println("Default value in the field: " +val);
		//***Task: Clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		Thread.sleep(2000);
		//***Task: Confirm that edit field is disabled
		WebElement check = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean status = check.isEnabled();
		System.out.println("Is Enable status: " +status);
		if (status == false){
			System.out.println("Confirmed!.Field is Disabled");
			
		} else {
			System.out.println("Field is enable");
		}
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		
		// Bond with Buttons --> 2
		
		driver.findElement(By.xpath("//a[@href='pages/Button.html']")).click();
		//***Task: Find position of button (x,y)
		WebElement location = driver.findElement(By.id("position"));
		org.openqa.selenium.Point vals = location.getLocation();
		System.out.println("x position: " +vals.x + "  Y position: " +vals.y);
		//***Task: Find button color
		WebElement colourButton = driver.findElement(By.id("color"));
		String rgbvalue = colourButton.getCssValue("background-color");
		String backgroundcolor = colourButton.getAttribute("style");
		System.out.println( backgroundcolor + "  value: " +rgbvalue);
		//***Task: Find the height and width
		WebElement hwButton = driver.findElement(By.id("size"));
		org.openqa.selenium.Dimension dimens = hwButton.getSize();
		System.out.println("Height: " +dimens.height + "  width: " +dimens.width);
		Thread.sleep(3000);
		//***Task Go to home page by clicking button 
		driver.findElement(By.xpath("//button[@id='home']")).click();
		Thread.sleep(1000);
		
		
		
		//Hyper Text --> 3
		
		driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
		Thread.sleep(1000);
		//---Task: Go to Back Home Page  
		driver.findElement(By.xpath("//a[@style='color: #CC0000']")).click();
		//going forward to hyper text task page to do remaining task
		driver.findElement(By.xpath("//a[@href='pages/Link.html']")).click();
		//***Task: Find where am supposed to go without clicking me?
		String reflink = driver.findElement(By.xpath("//a[@href='Button.html']")).getAttribute("href");
		System.out.println("Reference link: " +reflink);
		Thread.sleep(2000);
		//***Task: clicking on "Verify am I broken?" hyperlink text
		driver.findElement(By.xpath("//a[@href='error.html']")).click();
		// Getting error 404 status page tile 
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		//***Task: Go to Home Page (Interact with same link name)
		driver.findElement(By.xpath("//a[@style='color: #CC0000']")).click();
		Thread.sleep(2000);
		
		//closing the browser
		driver.close();
	
	}
}

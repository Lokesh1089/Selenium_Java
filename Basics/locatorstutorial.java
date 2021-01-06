package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorstutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ajlok\\eclipse-workspace\\SeleniumFramework\\drivers\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
	
		// 1.ID
		
//		driver.findElement(By.id("login-username")).sendKeys("ajay123@gmail.com");
//		driver.findElement(By.id("login-signin")).click();
		
		// 2.Name 
		
//		WebElement UserName = driver.findElement(By.name("username"));
//		UserName.sendKeys("ok123@gmail.com");
//		driver.findElement(By.name("signin")).click();
		
		//3.X- Path extended html path
		
//		driver.findElement(By.xpath("//input[@id=\'login-username\']")).sendKeys("vijay123@gmail.com");
//		driver.findElement(By.xpath("//input[@id=\'login-signin\']")).click();
		
//		driver.findElement(By.className("form-control mobileNumberInput")).sendKeys("4564468745");
//		driver.findElement(By.className("submitBottomOption")).click();
		
		//4.CSS selector
		
//		driver.findElement(By.cssSelector("#login-username")).sendKeys("mick2@yahoo.com");
//		driver.findElement(By.cssSelector("#login-signin")).click();
		
		//5. Link text
		
	//	driver.findElement(By.linkText("Forgot username?")).click();
		
		//driver.findElement(By.linkText("Help")).click();
		
		//6. partial link text
		
		// driver.findElement(By.partialLinkText("Forgot")).click();
		
		driver.findElement(By.partialLinkText("He")).click();
		
	}

}

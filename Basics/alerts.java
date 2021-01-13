package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/Alert.html']")).click();
		
		//***Task: Click the button to display a alert box.
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Thread.sleep(1000);
		Alert alertOne = driver.switchTo().alert();
		System.out.println("Alert-1: " +alertOne.getText());
		Thread.sleep(1000);
		alertOne.accept();
		//***Task: Click the button to display a confirm box.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Alert alertTwo = driver.switchTo().alert();
		System.out.println("Alert-2: " +alertTwo.getText());
		Thread.sleep(1000);
		alertTwo.accept();
		//***Task: Click the button to display a prompt box.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Alert alertThree = driver.switchTo().alert();
		alertThree.sendKeys("EPS Engg College");
		System.out.println("Alert-3: " +alertThree.getText());
		Thread.sleep(2000);
		alertThree.accept();
		//***Task: Click the button to learn line-breaks in an alert.
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		Alert alertFour = driver.switchTo().alert();
		System.out.println("Alert-4: " +alertFour.getText());
		Thread.sleep(1000);
		alertFour.accept();
		//***Task: Click the below button and click OK.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='sweetalert()']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
		
		//output
		
//		Alert-1: I am an alert box!
//		Alert-2: Press a button!
//		Alert-3: Please enter your training institute name
//		Alert-4: Hello
//		How are you doing today?

		
		
	}

}

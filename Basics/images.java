package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class images {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//a[@href='pages/Image.html']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		WebElement brImage = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		
		
		if(brImage.getAttribute("naturalWidth").equals("0")) {
		System.out.println("Oops! Imgages is Broken");
		} else {
			System.out.println("No problem with the image");
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		Thread.sleep(1000);
		driver.close();
		
		
		
	}

}

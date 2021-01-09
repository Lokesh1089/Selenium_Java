package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//a[@href='pages/radio.html']")).click();
		Thread.sleep(1000);
		
		//***Task: Are you enjoying the classes?
		
		driver.findElement(By.id("yes")).click();
		Thread.sleep(1000);
		
		//***Task: Find default selected radio button
		
		WebElement defaultSelected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean statusDefault = defaultSelected.isSelected();
		if(statusDefault==true) {
			System.out.println("default selected radio button is --> Checked");
		} else {
			System.out.println("default selected radio button is --> UnChecked");
		}
		Thread.sleep(1000);
	
		
		//***Task: Select your age group (Only if choice wasn't selected)
		WebElement ageSelect = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		boolean statusAge = ageSelect.isSelected();
		if (statusAge == false) {
			ageSelect.click();
			System.out.println("Now You are selected  a age group (21-40)");
		} else {
			System.out.println("Already your age group is selected.No worries");
		}
		Thread.sleep(1000);
		
		//getting back to home page 
		driver.navigate().back();
		Thread.sleep(1000);
		//closing browser
		driver.close();
	}
}

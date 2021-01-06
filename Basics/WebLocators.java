import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebLocators {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
				
	//WebElement searchbox = driver.findElement(By.name("q"));
	
	//searchbox.sendKeys("Top 5 tourist places in india");

// xpath		
		//driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("Languages for selenium");

// find no of element with "input" name	 
		
	List<WebElement> listOfInputelement = driver.findElements(By.xpath("//input"));
	int count = listOfInputelement.size();
	System.out.println("Count of input element : "+count);
			
	// Other way of giving input to keys
		
	//	driver.findElement(By.name("q")).sendKeys("Learn selenium with java");
		
		driver.close();
		
	}

}

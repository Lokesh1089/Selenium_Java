package test;



import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.findElement(By.xpath("//a[@href='pages/Dropdown.html']")).click();	
		//Select training program by using index
		Select programList1 = new Select( driver.findElement(By.xpath("//select[@id='dropdown1']")));
		Thread.sleep(1000);
		programList1.selectByIndex(1);
		//Select training program by using text
		Select programList2 = new Select(driver.findElement(By.name("dropdown2")));
		Thread.sleep(1000);
		programList2.selectByVisibleText("Loadrunner");
		//Select training program by using value
		Select programList3 = new Select(driver.findElement(By.name("dropdown3")));
		Thread.sleep(1000);
		programList3.selectByValue("3");
		//get number of options
		Select programList4 = new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		List<WebElement> listOne = programList4.getOptions();
		System.out.println("Number of options in drop down: " +listOne.size());
		//options in dropdown
		for (WebElement options : listOne) {
			System.out.println(options.getText());
		}
		Thread.sleep(1000);
		//send keys to select
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("UFT/QTP1");
		//Select Multiple
		Select programList5 = new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
		boolean multipleStatus = programList5.isMultiple();
		if (multipleStatus==true) {
			System.out.println("Dropdown is Multiple Select type");
			programList5.selectByVisibleText("Appium");
			Thread.sleep(1000);
			programList5.selectByVisibleText("Selenium");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
	}

}

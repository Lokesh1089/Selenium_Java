import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverManager {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		// To run specific version of driver
		//WebDriverManager.chromedriver().driverVersion("87.0.4280.88").setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/");
		driver.close();
	}
}

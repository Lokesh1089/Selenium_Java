import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author The Winter Soldier
 *
 */
public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = "C:\\Users\\ajlok\\eclipse-workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe";
		
		
		
		System.setProperty("webdriver.gecko.driver", projectPath);
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
	}
	
}

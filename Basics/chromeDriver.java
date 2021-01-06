import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriver {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir");
				
		 System.setProperty("webdriver.chrome.driver",  driverPath+"\\drivers\\chromedriver\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.toolsqa.com/");
		 try {
			 Thread.sleep(3000);
		 } catch (InterruptedException e ) {
			 e.printStackTrace();
		 }
		 driver.close();
	
	}
}



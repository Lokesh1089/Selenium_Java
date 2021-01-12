package test;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTables {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//a[@href='pages/table.html']")).click();
		//*[@id="table_id"]/tbody/tr[1]/th[1]
		//*[@id="table_id"]/tbody/tr[2]/td[1]
		//*[@id="table_id"]/tbody/tr[3]/td[1]
		//*[@id="table_id"]/tbody/tr[5]/td[1]
		// ***Task: Number of rows 
		List<WebElement> rows =driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr"));
		int rowCount = rows.size();
		System.out.println("No of rows :" +rowCount );
		
		//*[@id="table_id"]/tbody/tr[1]/th[1]
		//*[@id="table_id"]/tbody/tr[1]/th[2]
		//*[@id="table_id"]/tbody/tr[1]/th[6]
		//***Task: Number of column
		List<WebElement> columns = driver.findElements(By.xpath("//*[@id=\"table_id\"]/tbody/tr[1]/th"));
		int columnCount = columns.size();
		System.out.println("Number of columns: " +columnCount);
		//***Task:Get Progress value of Learn to interact with Elements
		String progressVal = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[4]/td[2]")).getText();
		System.out.println("Progress value of interact with elements : " +progressVal);
		Thread.sleep(1000);
		//***Task: Check vital task for least completed progress
		driver.findElement(By.xpath("(//input[@name='vital'])[3]")).click();
		Thread.sleep(2000);
		
		//*[@id="table_id"]/tbody/tr[1]/th[5]
		//*[@id="table_id"]/tbody/tr[2]/td[5]
		//*[@id="table_id"]/tbody/tr[3]/td[5]
		//*[@id="table_id"]/tbody/tr[5]/td[5]
	
		// Printing mentors name by using for loop
		String bxpath = "//*[@id=\"table_id\"]/tbody/tr[";
		String axpath = "]/td[5]";
		System.out.println("Mentor List : ");
		for(int i=2;i<=rowCount;i++) {
			String actxpath = bxpath+i+axpath;
			String mentorList = driver.findElement(By.xpath(actxpath)).getText();
			System.out.println(mentorList);
			}
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.close();
	}
}
// Output
//No of rows :5
//Number of columns: 6
//Progress value of interact with elements : 30%
//Mentor List : 
//Sarath
//Babu
//Gopi
//Koushik

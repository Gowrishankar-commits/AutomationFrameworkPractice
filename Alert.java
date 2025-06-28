import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
			// Selenium Manager
			WebDriver driver = new FirefoxDriver();
			// WebDriver driver = new ChromeDriver();

			driver.manage().window().fullscreen();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			driver.findElement(By.id("name")).sendKeys("Kunal");
			driver.findElement(By.xpath("//input[@value='Confirm']")).click();
			System.out.println(driver.switchTo().alert().getText()); 
			//driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();

	}
		


}

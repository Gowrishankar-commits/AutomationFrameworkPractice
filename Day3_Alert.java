import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day3_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("name")).sendKeys("Name");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println( driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.className("btn-style")).click();
		System.out.println(driver.switchTo().alert().getText()); 
		driver.switchTo().alert().dismiss();
		
	}

}

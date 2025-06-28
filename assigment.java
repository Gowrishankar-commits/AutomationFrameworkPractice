import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assigment {

	public static void main(String[] args) throws InterruptedException {	
		// TODO Auto-generated method stub

		//https://rahulshettyacademy.com/loginpagePractise/
		
		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();	
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));

		WebElement okbtn = driver.findElement(By.id("okayBtn"));

		//System.out.println("Displayed: " + okbtn.isDisplayed());
		//System.out.println("Enabled: " + okbtn.isEnabled());
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",okbtn);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()",okbtn);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("myModal")));
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-info']")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,1500)"); 
		List<WebElement>product  = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i =0; i<product.size();i++)
		{
			product.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	
		
		
	//	WebElement okbtn = driver.findElement(By.xpath("//button[@id='okayBtn']"));
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("By.id('okayBtn'))).click();");
		
		//id="okayBtn"
		//driver.switchTo().alert().accept();
		//driver.findElement(By.cssSelector("select.form-control")).click();
		
		
	}
		

}

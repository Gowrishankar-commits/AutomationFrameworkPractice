import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWai {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		//driver.findElement(By.id("btn1")).click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("txt1")));
		//driver.findElement(By.id("txt1")).sendKeys("weuku");
		
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(500);
		Wait <WebDriver> wait =  new FluentWait<>(driver)
		.withTimeout(Duration.ofSeconds(25)	)
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(d -> {
		    WebElement element = d.findElement(By.id("txt1"));
		    return element.isDisplayed() ? element : null;
		});
		   foo.sendKeys("hello fluent wait");
	}

}

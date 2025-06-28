import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Day2_Selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.partialLinkText("Click")).click();
		Set <String> window = driver.getWindowHandles(); 
		Iterator<String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
		WebElement ch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='example']")));
		System.out.println(ch.getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.tagName("h3")).getText()); 
	} 

}

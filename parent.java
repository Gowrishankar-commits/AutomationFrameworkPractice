import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class parent {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement link = w.until(ExpectedConditions.elementToBeClickable(By.className("blinkingText")));
		link.click();
		Set <String> windows =  driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
			String parentid = it.next();
			String Childid = it.next();
			driver.switchTo().window(Childid);
		WebElement child =	w.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".im-para.red")));
		String email = (child.getText().split("at")[1].trim().split(" ")[0]);
		driver.switchTo().window(parentid);
		driver.findElement(By.id("username")).sendKeys(email);
		
		

}

}

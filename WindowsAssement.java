import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsAssement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://the-internet.herokuapp.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
		driver.findElement(By.partialLinkText("Multiple")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement child1 = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Click")));
		child1.click();
       // wait.until(d -> d.getWindowHandles().size() == 2);
		Set<String>window=	driver.getWindowHandles();
		Iterator <String> it = window.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		WebElement ch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='example']")));
		System.out.println(ch.getText());
		driver.switchTo().window(parent);
		WebElement parenttext = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".example")));
		System.out.println(parenttext.getText());

	}

}

//import org.openqa.selenium.support.decorators.WebDriverDecorator;
import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	
	void login () {
	System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
	WebDriver driver = new FirefoxDriver();

	driver.get("https://testautomationcentral.com/demo/");
	
	
	
	//driver.get("https://magento.softwaretestingboard.com/");
	/*
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	WebElement selectGear = driver.findElement(By.xpath("//*[@id=\'ui-id-6\']"));
	
	Actions actions = new Actions(driver);
	actions.moveToElement(selectGear).perform();
	
	WebElement fitness = driver.findElement(By.xpath("//*[@id=\"ui-id-26\"]"));
	fitness.click();
	
	
	WebElement pushup = driver.findElement(By.linkText("Go-Get'r Pushup Grips"));
	pushup.click();
	
	WebElement stockavalibility = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[3]/div[2]/div[1]/span"));
	
	String check = stockavalibility.getText();
	
	String expectedText = "In stock";
	*/
	/*
	
	driver.get("https://magento.softwaretestingboard.com/go-get-r-pushup-grips.html");
	String currentWindow = driver.getWindowHandle();

	// Ensure the window is still open
	if (driver.getWindowHandles().contains(currentWindow)) {
	    System.out.println("Window is active and ready for interaction.");
	} else {
	    System.out.println("Window is closed or not accessible.");
	}
	
	*/
	
	//WebElement stockavalibility = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[3]/div[2]/div[1]/span"));
	//driver.manage().timeouts().Wait(Duration.ofSeconds(10));
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(55));
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".actions")));
	//WebElement element = driver.findElement(By.cssSelector("#product-addtocart-button"));
	//WebElement element = driver.findElement(By.cssSelector("#product-addtocart-button"));
	//((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	
	//WebElement cart = driver.findElement(By.cssSelector("#product-addtocart-button"));
	
//	WebElement addtocart = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[1]/div[4]/form/div/div/div[2]/button/span"));
//	addtocart.click();
	//String check = stockavalibility.getText();
	/*
	String expectedText = "In stock";
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	if(check.equals(expectedText)) {
		
		WebElement addtocart = driver.findElement(By.id("product-addtocart-button"));
		addtocart.click();
	} else {
		System.out.println("Stock is not avaliable");

	}
	*/

	///html/body/div[2]/main/div[1]/div[2]/div/div/div/a
	

	}
	}

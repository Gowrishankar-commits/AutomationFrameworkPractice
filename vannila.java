import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class vannila {

	public static void main(String[] args) {

		// https://rahulshettyacademy.com/angularpractice/
		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Rahual Shetty");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rahualshetty@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("willgetnewjob");
		driver.findElement(By.cssSelector("input#exampleCheck1")).click();
		WebElement StaticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(StaticDropdown);
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(50,1500)");
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2025-06-15");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert-success")).getText());

	}
}
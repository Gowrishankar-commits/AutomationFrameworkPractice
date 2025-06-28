import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
		// Selenium Manager
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ja");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		// li[class='ui-menu-item'] a

		for (WebElement option : options) {
			if (option.getText().equals("Japan")) {
				// Thread.sleep(2000);
				option.click();
				break;
//			}
		}
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// id="ctl00_mainContent_chk_friendsandfamily"
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		// class="ui-state-default ui-state-active"
		// Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement date = wait.until(ExpectedConditions.visibilityOfElementLocated(
		// By.cssSelector(".ui-state-default.ui-state-active")
		// ));

		// .ui-state-default.ui-state-active
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		// driver.findElement(By.className("ui-state-default.ui-state-active")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if (driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			System.out.println("is Enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// display: block; opacity: 0.5;

		// discount-checkbox
	}
	}
}

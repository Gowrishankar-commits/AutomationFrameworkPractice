import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Day5_DropdownAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("autosuggest")).sendKeys("Indi");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
			break;
			}
		}
		driver.findElement(By.id("divpaxinfo")).click();
		String adult = driver.findElement(By.id("spanAudlt")).getText();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncChd")).click();
		driver.findElement(By.className("buttonN")).click();
		WebElement staticdropodown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticdropodown);
		dropdown.selectByVisibleText("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
	}
	

}

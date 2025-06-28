import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
		// Selenium Manager
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		String[] items = {"Cucumber","Beetroot"};
		
		//additems(driver, items); // Static call method without object creation
		
		waits b = new waits();
		b.additems(driver, items);
		cart(driver);
		

	}
	public static void additems(WebDriver driver, String[] items) {
		
		List<WebElement>product = driver.findElements(By.cssSelector("h4.product-name"));
		int j=0;
		for(int i =0; i<product.size(); i++) 
			
		{
			
			String[] name = product.get(i).getText().split("-");
			String formatedName=name[0].trim();
			List itemsNeededList = Arrays.asList(items);
			for (String itemNeeded : items) {
			if(itemsNeededList .contains(formatedName)) {
				j++;
			
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
				if(j==itemsNeededList.size()) {
					break;
				}
				
			}
			}
			
		}
		

		
	}
	
	public static void cart(WebDriver driver) 
	{
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click(); ////button[contains(text(),'PROCEED')]
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		//promoCode
		
	}

}

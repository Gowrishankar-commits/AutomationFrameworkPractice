import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cucumber {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
		// Selenium Manager
		WebDriver driver = new FirefoxDriver();
		// WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		String[] items = {"Cucumber","Beetroot"};
		
		
		//List<String> itemsNeededList = Arrays.asList(items);
		
		
	List<WebElement>product = driver.findElements(By.cssSelector("h4.product-name"));
	
		int j =0;
		
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
		//class="product-name"

}
	
}

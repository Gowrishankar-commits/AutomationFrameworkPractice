import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReversString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		StringBuilder sb = new StringBuilder(name);
		sb.reverse();
		
		String reverse = sb.toString();
		
		System.out.println(reverse);
	
		/*
		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		List<WebElement> options = driver.findElements(By.id("ui-id-1"));
		for (WebElement option : options) {
			
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
		}
		*/
		
	}

}

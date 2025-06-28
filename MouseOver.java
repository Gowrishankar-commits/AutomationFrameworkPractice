import java.awt.Desktop.Action;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		/*
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector(".nav-line-1-container"))).build().perform();
		WebElement move = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).doubleClick().build().perform();
		a.moveToElement(move).keyDown(Keys.SHIFT).sendKeys("Samsung back case ").build().perform();
		a.moveToElement(move).contextClick();
		a.moveToElement(move).sendKeys(Keys.ENTER).build().perform();
		

*/
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); 
        String s = scan.nextLine();
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
		
	}

}

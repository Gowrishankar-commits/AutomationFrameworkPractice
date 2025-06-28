import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Hulk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver"); 
		//Selenium Manager 
		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
		
		// Static Dropdown ctl00_mainContent_DropDownListCurrency
		
		//any dropdown have tag with select there is special class in selenium to handles select dropdownds
		
		//dropdown with select tag
	
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown =new Select(staticdropdown);
		dropdown.selectByIndex(2);
		System.out.print(dropdown.getFirstSelectedOption().getText()); // this is webelemnet // it will see AED is selected it will come hear 
		
		dropdown.selectByVisibleText("USD");
		System.out.print(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		int i = 1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Mumbai (BOM)']")).click();
		
		////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click()
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"));
		System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));
		
		//pull request - mergre the will review 
		// they don't like indexes 
		
		//dynamic dropdrown load based on user action
		//a[@value='MAA']
		//a[@value='MAA'][2]
		////*[@id="dropdownGroup1"]/div/ul[3]/li[3]/a
		
		//for (int i =0; i<3; i++) {
		//driver.findElement(By.id("hrefIncAdt")).click();
		//}
		//for (int i =0; i<3; i++) {
	//		driver.findElement(By.id("hrefIncAdt"));
	//	}
		//        hrefIncAdt
		//id="divpaxinfo"
		// 
		
		//	dropdown.selectByValue("AED");
		
	/*	
		//Static Dropdown
		WebElement Staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select select = new Select(Staticdropdown);
		
		Selenium 4.6.0 Selenium Manager - new package it will go to the internet it will downlods 
		
		System.setProperty("webdriver.chrome.driver","path")
		
	//	String one = WebElement (select.selectByIndex(1).getText());
		select.selectByIndex(1);
		
			
		/*
		System.out.println(select.getFirstSelectedOption().getText());  //INR
		select.selectByVisibleText("AED");
		System.out.println(select.getFirstSelectedOption().getText());  //AED
		
		select.selectByValue("USD");
		System.out.println(select.getFirstSelectedOption().getText());//USD
		/*
		
		WebElement m = driver.findElement(By.xpath("//input[@role='combobox']"));
				//https://rahulshettyacademy.com/dropdownsPractise/
			m.sendKeys("world breaker hulk");
			driver.manage().window().minimize();
			m.sendKeys(Keys.ENTER);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			driver.manage().window().fullscreen();
			//<input name="search_query" aria-controls="i0" aria-expanded="true" type="text" autocomplete="off" autocorrect="off" aria-autocomplete="list" role="combobox" class="ytSearchboxComponentInput yt-searchbox-input title" placeholder="Search">
		//	WebElement v = driver.findElement(By.className("ytSearchboxComponentInput"));
		//	v.sendKeys("superman");
		// v.sendKeys(Keys.ENTER);
			
		
		
		//WebElement m=driver.findElement(By.id("gsc−i−id1"));
	     // m.sendKeys("Java")
		//m.sendKeys(Keys.ENTER);
		 * 
		 * 
		 */
	}

}

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Rahul {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geko.driver", "/Users/world/Downloads/Book/geckodriver");
		WebDriver driver = new FirefoxDriver();

		String password = getPassword(driver);
		System.out.println("password");

		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Gowri");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		Thread.sleep(299);
		driver.findElement(By.className("submit")).click();

		// String name = driver.findElement(By.tagName("h2")).getText();
		Thread.sleep(299);

		// System.out.println(driver.findElement(By.tagName("h2")).getText());
//		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"");
		String name2 = driver.findElement(By.tagName("h2")).getText();
		System.out.print(name2);
		System.out.println("------Passowrd------");
		String name1 = driver.findElement(By.cssSelector(".login-container")).getText();
		System.out.print(name1);
		System.out.println("------Login User------");
	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(200);
		driver.findElement(By.className("reset-pwd-btn")).click();

		String passwordText = driver.findElement(By.cssSelector(".infoMsg")).getText();
		String[] password = passwordText.split("'");
		String pass = password[1].split("'")[0];
		return pass;
	}
}

//	public static void getpassword(driver) {

//	}}\

// driver.get("https://practice.expandtesting.com/login");
// https://practice.expandtesting.com/

// System.out.println(driver.findElement(By.linkText("/register")).getText());
/*
 * System.out.println(driver.findElement(By.tagName("b")).getText());
 * 
 * Assert.assertEquals(driver.findElement(By.tagName("b")).getText()
 * ,"Test Login page");
 * 
 * //Assert.assertEquals(driver.findElement(By.tagName("b")).getText()
 * ,"Test Login page"); String name1 = "practice";
 * driver.findElement(By.tagName("input")).sendKeys(name1); Thread.sleep(2000);
 * System.out.println(driver.findElement(By.cssSelector(
 * "div[class='col-9']:nth-child(2)")).getText());
 * 
 * driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
 * 
 * driver.findElement(By.xpath("//button[text()='Login']")).click(); // find
 * locator based on the text driver.close();
 */
//// button[text()='Login'

/// Users/world/Downloads/edgedriver_mac64

// input[contains(@id,'username')] //regular expression

// System.setProperty("webdriver.edge.driver",
// "/Users/world/Downloads/edgedriver_mac64_m1 (2)/msedgedriver");
// WebDriver driver = new EdgeDriver();
/*
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); driver.get(
 * "https://sso.teachable.com/secure/9521/identity/sign_up/otp?wizard_id=_s6eaAx7bVOuQwTNnsmyO5rzITOYQlhl6MS2wC6tu8bechOJwWJeQ41l6cszlvuQkGJHjteXeDvo568t1d6XZw"
 * ); driver.findElement(By.id("name")).sendKeys("Gowrishankar");
 * driver.findElement(By.cssSelector("input#email")).sendKeys(
 * "Gowrishankar@gmail"); //use ccsSelector with id - tag#id
 * driver.findElement(By.cssSelector("button.Y4agH")).click(); // use
 * ccsSelector with class name - tag.classname
 * System.out.println(driver.findElement(By.cssSelector(
 * "span[aria-live='polite']")).getText());
 * driver.findElement(By.cssSelector("input[autocomplete='email']")).clear();
 * driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys(
 * "GowthamAbi1998@gmail.com");
 * driver.findElement(By.xpath("//input[@autocomplete='email'][1]")).sendKeys(
 * "GowthamAbi1998@gmail.com");
 * driver.findElement(By.xpath("//div/input[1]")).clear();
 * driver.findElement(By.cssSelector(".XSXtW")).sendKeys("GowriABI");
 * //driver.findElement(By.xpath("//input[@placeholder*='email']")).clear();
 * Thread.sleep(200); driver.findElement(By.id("email")).clear();
 * driver.findElement(By.cssSelector("input[placeholder='you@email.com']")).
 * sendKeys("gowthamshankar919@gmail.com");
 * driver.findElement(By.className("Y4agH")).click();
 * driver.get("https://sso.teachable.com/secure/9521/current_user/profile");
 * //https://sso.teachable.com/secure/9521/current_user/profile //<button
 * type="button"
 * class="Y4agH tLoa5 col-12 uni-mt-16 uni-pv-16 uni-pv-8 uni-ph-32 mzjMa rJteP PM45p"
 * data-test="btn-signup" data-testid="btn-signup" id="otp-login-btn"
 * style="background-color: rgb(9, 165, 154); border-color: rgb(9, 165, 154);"><
 * span>Send code</span></button> //sendKeys("gowthamshankar919@gmail.com");
 * //ccs input[type = 'text']:
 * 
 */
// Assert.assertEquals("", "","not a match");
// driver.get("");
// Aession

// <input id="email" autocapitalize="none" autocomplete="email"
// aria-describedby="my-error-id" class="XSXtW x97ZL" data-testid="email-input"
// value="gowthamabi1998@gmail.com" placeholder="you@email.com"><input
// id="email" autocapitalize="none" autocomplete="email"
// aria-describedby="my-error-id" class="XSXtW x97ZL" data-testid="email-input"
// value="gowthamabi1998@gmail.com" placeholder="you@email.com">
// XSXtW x97ZL
// div.outer > div.inner > input

// <input type="email" name="email" id="email" required="" autocomplete="email"
// class="form-input p-v-1-xs p-l-2-xs p-r-4-xs col-12-xs bodyMain">
// //input[@name="email"] -- xpath
// input[name="email"] --- ccsselector
// //div/input[1] -- travers xpath
// div.XSXtW
// Xpath and css selector
// custom Xpath
// <input data-test="allow-marketing-emails"
// data-testid="allow-marketing-emails" type="checkbox" class="uni-mr-8 D0D4S
// m-t-0-xs flex-no-shrink v-middle" id="allowMarketingEmails"
// name="allowMarketingEmails" style="--checkbox-color: #09A59A;">
// Tagname[@attribute='value]
// input[@name="allowMarketingEmails"]

// driver.findElement(By.linkText("Privacy")).click();

// Privacy

// implicite wait

// <span aria-live="polite" class="jdGIU fV5Nv" role="alert" id="my-error-id"
// data-testid="email-input-error">Invalid email</span>
// General syntax for cssSelector is - tagname[attribute='value'} eg :
// input[autocomplete='name']
// <span aria-live="polite" class="jdGIU fV5Nv" role="alert" id="my-error-id"
// data-testid="email-input-error">Invalid email</span>

//
// class="Y4agH tLoa5 col-12 uni-mt-16 uni-pv-16 uni-pv-8 uni-ph-32 mzjMa rJteP
// PM45p"

// XSXtW x97ZL
// <input id="name" autocapitalize="none" autocomplete="name"
// aria-describedby="my-error-id" class="XSXtW x97ZL" data-testid="name-input"
// value="" placeholder="your name">
// <a href="checkboxes.html" class="text-blue-500 hover:underline"
// onclick="loadPage('checkboxes.html', event)">Checkboxes
// (Multiple Selection)</a>

// WebDriver driver = new FirefoxDriver();
/*
 * Fundamental of Java int, float string , char, Variables & Data types in java
 * 
 */

// Arraya
/*
 * String[] name = {"Uma", "Abi","Murali"};
 * 
 * //int[] arr2 = {1,2,3,4,5}; int[] age = {12,14,123,21};
 * 
 * for(int i = 0; i<age.length; i++) { // arra System.out.println(age[i]);
 * 
 * } for(int j = 0;j<name.length;j++) { System.out.println(name[j]); }
 * 
 * for( String s: name) { // enhanced for loop System.out.println(s); } for(int
 * g : age) { System.out.println(g); }
 */
/*
 * driver.get("https://rahulshettyacademy.com");
 * System.out.println(driver.getTitle());
 * System.out.println(driver.getCurrentUrl()); //driver.close();
 * //driver.quit(); //Microsoft edge //driver.get("http://www.Amazon.com");
 * 
 */
/*
 * driver.get("https://rahulshettyacademy.com/");
 * driver.findElement(By.cssSelector("a.theme-btn")).click();
 */
// div.login-btn:nth-child(2) > a:nth-child(1)

/*
 * driver.get(
 * "https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php"
 * );
 * 
 * driver.findElement(By.name("name")).sendKeys("Gowrishankar M"+Keys.ENTER);
 * driver.findElement(By.id("email")).sendKeys("gowtham.shankar@gmail.com");
 * driver.findElement(By.id("gender")).click();
 */
// driver.close();// close the current window
// driver.quit();

// driver.findElement(By.cssSelector(input."form-control")).sendKeys("gowthamshankar919@gmail.com");

// driver.findElement(By.name("email")).sendKeys("gowthamshankar919@gmail.com");
// driver.findElement(By.className("orm-check-input mt-0")).click();

// String currentWindow = driver.getWindowHandle();
// theme-btn //<label>Male</label> foorm-check-input mt-0

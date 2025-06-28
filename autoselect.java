import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autoselect {

	public static void main(String[] args) throws InterruptedException {
		String name = "Hello";
		String reverse = "";
		for (int i = name.length()-1; i >=0; i-- ){
			reverse += name.charAt(i);
		}
		System.out.println("Reversed: "+ reverse);
		
	}
		
	
	
		// TODO Auto-generated method stub
		/*
		System.setProperty("webdriver.geko.driver","/Users/world/Downloads/Book/geckodriver"); 
		
		WebDriver driver = new FirefoxDriver(); //FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption1")).isSelected();
		driver.findElement(By.id("checkBoxOption2")).click();
		driver.findElement(By.id("checkBoxOption2")).isSelected();
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("checkBoxOption3")).isSelected();
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//("input[type='checkbox']")
		*/
		/*
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option : options)
		{
			if(option.getText().equals("India"))
			{
				Thread.sleep(2000);
				option.click();
				break;
			}
			
		}
		
		driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected());
		Assert.assertTrue(true);
		//Assert.assertTrue(false);
		//System.out.println( Assert.assertTrue(driver.findElement(By.cssSelector("input[id *= 'friendsandfamily']")).isSelected()));
		*/
		//class="ui-corner-all"
	}

import pandas as pd

# Weekly Compounding Tracker Template
data = {
    "Week": [f"Week {i+1}" for i in range(12)],
    "Skill Focus": [
        "Core Java + Loops", "Selenium Locators", "TestNG + Annotations", "Java OOP + Framework Setup",
        "API Testing Basics", "Jenkins + CI Intro", "Project GitHub Upload", "REST Assured + Assertions",
        "YouTube Channel Setup", "Video Script + Recording", "Quant Python Setup", "Backtest Simple Strategy"
    ],
    "Visibility Task": [
        "Push Java repo to GitHub", "Post LinkedIn update", "Share TestNG demo code", "Publish GitHub project",
        "Add project screenshot to LinkedIn", "Update Resume + GitHub", "Write Medium blog on automation", "Post short tutorial video",
        "Create YouTube channel art", "Upload 1st video", "Share Python repo", "Show profit chart on LinkedIn"
    ],
    "Income Task": [
        "Basic freelance QA gig", "Freelance bug report", "Resume to QA clients", "Apply for job upgrade",
        "Apply to freelance sites", "Reach out to 5 clients", "Start YouTube AdSense", "Freelance API test job",
        "Monetize YouTube", "Add affiliate link to video", "Paper trade ₹10K capital", "Plan 1st real ₹ trade"
    ],
    "Expected Income Range": [
        "₹0–₹500", "₹500–₹1,000", "₹1,000–₹2,000", "₹2,000–₹5,000",
        "₹5,000–₹8,000", "₹8,000–₹10,000", "₹10,000–₹15,000", "₹15,000–₹20,000",
        "₹20,000–₹30,000", "₹25,000–₹35,000", "₹30,000–₹40,000", "₹40,000–₹50,000"
    ]
}

df = pd.DataFrame(data)
file_path = "/mnt/data/Skill_Visibility_Income_Tracker.xlsx"
df.to_excel(file_path, index=False)

file_path
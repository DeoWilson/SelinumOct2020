package week2.day2.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1EditFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//input[@type='text' and @id='email']").sendKeys("deowilson1996@gmail.com");
		driver.findElementByXPath("//input[@type='text' and @value= 'Append ']").sendKeys("Adding this too");
		driver.findElementByXPath("//input[@type='text' and @value= 'Append ']").sendKeys(Keys.TAB);
		Thread.sleep(3000);
		String valuePresent = driver.findElementByXPath("//label[text()='Get default text entered']/following::input[1]").getAttribute("value");
		System.out.println("The Value Present: " +valuePresent);
		driver.findElementByXPath("//label[text()='Get default text entered']/following::input[2]").clear();
		boolean enabled = driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following::input").isEnabled();
		if (enabled == true) {
		System.out.println("The Field is Enabled");
		}
		else {
			System.out.println("The Field is Disabled dude");
		}
		
		
	}

}

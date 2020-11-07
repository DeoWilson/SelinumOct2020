package week4.day1.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickMe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/TextChange.html");
		WebElement button = driver.findElementById("btn");
		String text = button.getText();
		String text1="I'm going to change !!";
		if (text.contains(text1)) {
			System.out.println("Not Changed");
		}
		else {
			System.out.println("Changed");
		}
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Click ME!']").click();
		
	}

}

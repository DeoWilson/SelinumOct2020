package week4.day1.Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/disapper.html");
		Thread.sleep(3000);
		boolean displayed = driver.findElementById("btn").isDisplayed();
		if(displayed == false)
		{
			System.out.println("Disappered");
		}
		else {
			System.out.println("Still there");
		}
		
		String text = driver.findElementByXPath("//strong").getText();
		String text1="I know you can do it! Button is disappeared!";
		if (text.contains(text1)) {
			System.out.println("Got the text");
		}
		else {
			System.out.println("Text not appeared");
		}

	}

}

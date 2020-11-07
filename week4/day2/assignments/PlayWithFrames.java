package week4.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayWithFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		driver.findElementByXPath("//body[contains(text(),'I am inside a frame')]/button").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElementByXPath("//body[contains(text(),'I am inside a nested frame')]/button").click();
		driver.switchTo().defaultContent();
		int sizeOfTheFrame = driver.findElementsByTagName("iframe").size();
		System.out.println("The Total Frames available: " +sizeOfTheFrame);
		

	}

}

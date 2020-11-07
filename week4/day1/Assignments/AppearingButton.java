package week4.day1.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppearingButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/appear.html");
		WebElement button = driver.findElementById("btn");
		boolean displayed = button.isDisplayed();
		if(displayed == false)
		{
			System.out.println("Not appeared");
		}
		else {
			System.out.println("It is there");
		}
		Thread.sleep(7000);
		boolean displayed1 = button.isDisplayed();
		if(displayed1 == true)
		{
			System.out.println("It came");
		}
		else {
			System.out.println("Not appeared");
		}

	}

}

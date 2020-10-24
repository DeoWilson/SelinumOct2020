package week2.day2.assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Buttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[@id='home']").click();
		Thread.sleep(3000);
		driver.navigate().back();
		Point location = driver.findElementByXPath("//button[@id='position']").getLocation();
		System.out.println("The Position of the button is: " +location);
		String cssValue = driver.findElementByXPath("//button[@id='color']").getCssValue("background-color");
		System.out.println("The colour of the button is: " +cssValue);
		Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println("The Size of the button is: " +size);

	}

}

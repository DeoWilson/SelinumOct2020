package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Classroom2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		WebElement MensFashion = driver.findElementByXPath("//li[@navindex='5']/following::span");
		Actions builder = new Actions(driver);
		builder.moveToElement(MensFashion).perform();
		driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		WebElement selectshirt = driver.findElementByXPath("//span[contains(@id,'display-price')]");
		builder.moveToElement(selectshirt).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();
	}

}

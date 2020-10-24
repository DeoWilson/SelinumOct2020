package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Image {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//label[@for='home']/following::img[1]").click();
		Thread.sleep(3000);
		driver.navigate().back();
		//Broken Image find
		driver.findElementByXPath("//label[@for='home']/following::img[3]").click();
		
		
	}

}

package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement item1 = driver.findElementByXPath("(//li/span)[1]");
		WebElement item4 = driver.findElementByXPath("(//li/span)[4]");
		Actions builder=new Actions(driver);
		builder.dragAndDrop(item1, item4).perform();
	}

}

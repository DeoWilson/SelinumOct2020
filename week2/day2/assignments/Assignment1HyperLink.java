package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1HyperLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//div[@class='row']//a)[1]").click();
		Thread.sleep(3000);
		driver.navigate().back();
		String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		System.out.println("Navigating to:" +attribute);
		//broken URL Testing need to add
		driver.findElementByXPath("(//div[@class='row']//a)[4]").click();
		
		

	}

}

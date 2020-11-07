package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IRCTC {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElementByXPath("(//button[@class='btn btn-primary'])[1]").click();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listHandles= new ArrayList<String>(windowHandles);
		String firstWindow = listHandles.get(0);
		String secondWindow = listHandles.get(1);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(firstWindow);
		driver.close();

	}

}

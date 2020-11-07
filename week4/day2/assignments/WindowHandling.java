package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.findElementById("home").click();
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		int windowsOpenedsofar = windowHandles.size();
		System.out.println(windowsOpenedsofar);
		driver.findElementById("color").click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> listwindows = new ArrayList<String>(windowHandles1);
		for(int i=0; i<(windowHandles1.size()-1); i++) {
			driver.switchTo().window(listwindows.get(i));
			driver.close();
		}
		driver.switchTo().window(listwindows.get(windowHandles1.size()-1));
		driver.close();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("http://leafground.com/pages/Window.html");
		driver1.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver1.findElementByXPath("(//button[@id='color'])[2]").click();
		
	}

}

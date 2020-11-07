package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev68594.service-now.com/");
		driver.switchTo().frame(0);
		driver.findElementById("user_name").sendKeys("admin");
		driver.findElementById("user_password").sendKeys("India@123");
		driver.findElementById("sysverb_login").click();
		driver.findElementById("filter").sendKeys("incident"); 
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='sn-widget-list-title' and text()='All' and @data-tooltip-overflow-only-text='true'])[2]").click();
		Thread.sleep(5000); 
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//button[@type='submit' and text()='New']").click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.switchTo().frame("gsft_main");
		String incidentNumber =driver.findElementById("incident.number").getAttribute("value");
		System.out.println(incidentNumber);
		driver.findElementByXPath("//button[@id='lookup.incident.caller_id']/span").click();
		driver.switchTo().defaultContent();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listhandles = new ArrayList<String>(windowHandles);
		String firstwindow = listhandles.get(0);
		String secondwindow = listhandles.get(1);
		driver.switchTo().window(secondwindow);
		driver.findElementByXPath("//a[text()='Abraham Lincoln']").click();
		driver.switchTo().window(firstwindow);
		driver.switchTo().frame("gsft_main");		
		driver.findElementById("incident.short_description").sendKeys("Description Value test");
		driver.findElementByXPath("(//button[@type='submit' and text()='Submit'])[1]").click();
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		driver.switchTo().frame("gsft_main");
		driver.findElementByXPath("//input[@placeholder = 'Search' and @class='form-control']").sendKeys(incidentNumber);
		driver.findElementByXPath("//input[@placeholder = 'Search' and @class='form-control']").sendKeys(Keys.ENTER);
		String incNum = driver.findElementByXPath("(//td[@class='vt']/a[1])[1]").getText();
		System.out.println(incNum);
		if (incNum.equalsIgnoreCase(incidentNumber)) {
			System.out.println("Incident Created Succesfully");
		}
		else {
			System.out.println("Sorry! Incident not created");
		}
		
		
		

	}

}

package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXPath {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("demosalesmanager");
		 driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		 driver.findElementByXPath("//input[@type='submit']").click();
		 driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();
		 driver.findElementByXPath("//a[contains (text(),'Leads')]").click();
		 driver.findElementByXPath("//a[contains (text(),'Create Lead')]").click();
		 driver.findElementByXPath("//input[@name ='companyName']").sendKeys("TestLeaf01");
		 driver.findElementByXPath("//input[@name ='firstName']").sendKeys("Johnny");
		 driver.findElementByXPath("//input[@name ='lastName']").sendKeys("William");
		 
		 WebElement Source = driver.findElementByXPath("//select[@name='dataSourceId']");
		 Select d1 = new Select(Source);
		 d1.selectByVisibleText("Employee");
		
		 WebElement Source1 = driver.findElementByXPath("//select[@name='marketingCampaignId']");
		 Select d2 = new Select(Source1);
		 d2.selectByValue("9001");
		 
		 WebElement Source2 = driver.findElementByXPath("//select[@name='ownershipEnumId']");
		 Select d3 = new Select(Source2);
		 d3.selectByIndex(2);
		 
		 WebElement Source3 = driver.findElementByXPath("//select[@name='generalCountryGeoId']");
		 Select d4 = new Select(Source3);
		 d4.selectByVisibleText("India");
		 driver.findElementByXPath("//input[@class='smallSubmit']").click();
		 
		 System.out.println("The Page Title:" +driver.getTitle());

	}

}

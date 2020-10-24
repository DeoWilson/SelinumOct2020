package week2.day1Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByPartialLinkText("CRM/SFA").click();
		 driver.findElementByLinkText("Accounts").click();
		 driver.findElementByLinkText("Create Account").click();
		 driver.findElementById("accountName").sendKeys("John");
		 driver.findElementByName("description").sendKeys("Automation Process");
		 driver.findElementById("groupNameLocal").sendKeys("Johnny");
		 driver.findElementById("officeSiteName").sendKeys("TestLeaf");
		 driver.findElementByName("annualRevenue").sendKeys("12345678");
		 
		 WebElement Source = driver.findElementByName("industryEnumId");
		 Select d1 = new Select(Source);
		 d1.selectByVisibleText("Computer Software");
		
		 WebElement Source1 = driver.findElementByName("ownershipEnumId");
		 Select d2 = new Select(Source1);
		 d2.selectByVisibleText("S-Corporation");
		 
		 WebElement Source2 = driver.findElementById("dataSourceId");
		 Select d3 = new Select(Source2);
		 d3.selectByValue("LEAD_EMPLOYEE");
		 
		 WebElement Source3 = driver.findElementById("marketingCampaignId");
		 Select d4 = new Select(Source3);
		 d4.selectByIndex(5);
		 
		 WebElement Source4 = driver.findElementById("generalStateProvinceGeoId");
		 Select d5 = new Select(Source4);
		 d5.selectByValue("TX");
		 
		 driver.findElementByClassName("smallSubmit").click();
		 
		 

	}

}

package week2.day1Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 driver.findElementById("username").sendKeys("demosalesmanager");
	 driver.findElementById("password").sendKeys("crmsfa");
	 driver.findElementByClassName("decorativeSubmit").click();
	 driver.findElementByPartialLinkText("CRM/SFA").click();
	 driver.findElementByLinkText("Leads").click();
	 driver.findElementByLinkText("Create Lead").click();
	 driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
	 driver.findElementById("createLeadForm_firstName").sendKeys("John");
	 driver.findElementById("createLeadForm_lastName").sendKeys("Williams");
	 
	 WebElement Source = driver.findElementById("createLeadForm_dataSourceId");
	 Select d1 = new Select(Source);
	 d1.selectByVisibleText("Employee");
	
	 WebElement Source1 = driver.findElementById("createLeadForm_marketingCampaignId");
	 Select d2 = new Select(Source1);
	 d2.selectByValue("9001");
	 
	 WebElement Source2 = driver.findElementById("createLeadForm_ownershipEnumId");
	 Select d3 = new Select(Source2);
	 d3.selectByIndex(2);
	 
	 WebElement Source3 = driver.findElementById("createLeadForm_generalCountryGeoId");
	 Select d4 = new Select(Source3);
	 
	 String Text = Source3.getText();
	 String text1 = "United States";
	 if (Text.contains(text1)) {
	 d4.selectByVisibleText("Turkey");
	 }
	 else {
		 d4.selectByVisibleText("India"); 
	 }
	 driver.findElementByClassName("smallSubmit").click();
	 
	 System.out.println("The Page Title:" +driver.getTitle());
	 
	

	}

}

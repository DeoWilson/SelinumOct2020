package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomEx {

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
		 //To select the Last Second
		 WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		 Select dropdown =new Select(source);
		 List<WebElement> temp = dropdown.getOptions();
		 int size =temp.size();
		 temp.get(size-2).click();
		 //To Select the Second
		 WebElement Source3 = driver.findElementById("createLeadForm_marketingCampaignId");
		 Select d4 = new Select(Source3);
		 d4.selectByIndex(2);		 		 
			
		}	 
		 		

	}



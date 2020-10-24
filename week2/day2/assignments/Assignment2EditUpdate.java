package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditUpdate {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='firstName' and @style='width: 212px;']").sendKeys("Hema");
		driver.findElementByXPath("//button[@class = 'x-btn-text' and text() = 'Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[3]").click();
		String Text = driver.findElementById("sectionHeaderTitle_leads").getText();
		String text = "View Lead";
		if (Text.contains(text)) {
			System.out.println("Page Title Matched:" +Text);
		}
		else {
			System.out.println("Page Title is not matched'");
		}
		driver.findElementByXPath("//a[@class = 'subMenuButton' and text() = 'Edit']").click();
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Updating CompanyName");
		driver.findElementByXPath("//input[@name ='submitButton' and @class ='smallSubmit' and @value = 'Update']").click();
		String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		String text3 = "Updating CompanyName";
		if (text2.contains(text3))
		{
			System.out.println("Properly Updated");
		}
		else {
			System.out.println("Not Updated");
		}
			
		
		
	}

}

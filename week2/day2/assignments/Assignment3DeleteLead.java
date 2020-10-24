package week2.day2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3DeleteLead {

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
		driver.findElementByXPath("//span[@class='x-tab-strip-text ' and text()= 'Phone']").click();
		driver.findElementByXPath("//input[@name= 'phoneCountryCode' and @style='width: 20px;']").clear();
		driver.findElementByXPath("//input[@name= 'phoneNumber' and @style='width: 152px;']").sendKeys("99");
		driver.findElementByXPath("//button[@class = 'x-btn-text' and text() = 'Find Leads']").click();
		Thread.sleep(3000);
		WebElement b1 = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]");
		String firstLeadId = b1.getText();
		System.out.println(firstLeadId);
		b1.click();
		driver.findElementByXPath("//a[@class='subMenuButtonDangerous' and text()='Delete']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("//input[@name='id' and @style='width: 212px;']").sendKeys(firstLeadId);
		driver.findElementByXPath("//button[@class = 'x-btn-text' and text() = 'Find Leads']").click();
		Thread.sleep(3000);
		String text = driver.findElementByXPath("//div[text()='No records to display']").getText();
		System.out.println(text);
		String text2= "No records to display";
		if (text.equalsIgnoreCase(text2)) {
			System.out.println("Deleted Successfully");
		}
		else {
			System.out.println("Not Deleted");
		}
		driver.close();
		
		

	}

}

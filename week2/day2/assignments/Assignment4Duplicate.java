package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Duplicate {

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
		driver.findElementByXPath("//span[@class ='x-tab-strip-text ' and text()= 'Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("mrc_77@gmail.com");
		driver.findElementByXPath("//button[@class = 'x-btn-text' and text() = 'Find Leads']").click();
		Thread.sleep(3000);
	    String text = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
	    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").click();
	    driver.findElementByXPath("//a[@class='subMenuButton' and text()= 'Duplicate Lead']").click();
	    String text2 = driver.findElementById("sectionHeaderTitle_leads").getText();
	    String text3= "Duplicate Lead";
	    if (text2.equalsIgnoreCase(text3)) {
	    	System.out.println("Matched");
	    }
	    else {
	    	System.out.println("Not Matched");
	    }
	    driver.findElementByClassName("smallSubmit").click();
	    String text4 = driver.findElementById("viewLead_firstName_sp").getText();
	    if (text4.equalsIgnoreCase(text)) {
	    	System.out.println("Duplicate created successfuly");
	    	    }
	    else {
	    	System.out.println("Duplicate not found");
	    }
	    
	    
		
		

	}

}

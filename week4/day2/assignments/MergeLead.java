package week4.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		 driver.findElementById("password").sendKeys("crmsfa");
		 driver.findElementByClassName("decorativeSubmit").click();
		 driver.findElementByPartialLinkText("CRM/SFA").click();
		 driver.findElementByXPath("//a[text()='Leads']").click();
		 driver.findElementByXPath("//a[text()='Merge Leads']").click();
		 driver.findElementByXPath("//input[@name='partyIdFrom']/following::a[1]").click();
		 Set<String> windowshandle = driver.getWindowHandles();
		 List<String> varhandles = new ArrayList<String>(windowshandle);
		 String firstwindow = varhandles.get(0);
		 String secondwindow = varhandles.get(1);
		 driver.switchTo().window(secondwindow);
		 driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10328");
		 driver.findElementByXPath("//button[@class='x-btn-text' and text()= 'Find Leads']").click();
		 Thread.sleep(2000);
		 driver.findElementByXPath("//td[1]//a[@class='linktext'][1]").click();
		 driver.switchTo().window(firstwindow);
		 driver.findElementByXPath("//input[@name='partyIdFrom']/following::a[2]").click();
		 Set<String> windowshandle1 = driver.getWindowHandles();
		 List<String> varhandles1 = new ArrayList<String>(windowshandle1);
		 String parentwindow = varhandles1.get(0);
		 String thirdwindow = varhandles1.get(1);
		 driver.switchTo().window(thirdwindow);
		 driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10329");
		 driver.findElementByXPath("//button[@class='x-btn-text' and text()= 'Find Leads']").click();
		 Thread.sleep(2000);
		 driver.findElementByXPath("//td[1]//a[@class='linktext'][1]").click();
		 driver.switchTo().window(parentwindow);
		 driver.findElementByClassName("buttonDangerous").click();
		 Alert alrt = driver.switchTo().alert();
		 Thread.sleep(3000);
		 alrt.accept();
		 Thread.sleep(3000);
		 driver.findElementByXPath("//a[text()='Find Leads']").click();
		 driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10328");
		 driver.findElementByXPath("//button[text()='Find Leads']").click();
		 Thread.sleep(3000);
		 String text = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
		 String text2 = "No records to display";
		 if(text.equalsIgnoreCase(text2)){
			 System.out.println("Merged Successfully");
		 }
		 else {
			 System.out.println("Not Merged successfully");
		 }
		 

	}

}

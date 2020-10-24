package week2.day1Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACMELogin {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://acme-test.uipath.com/login");
		 driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		 driver.findElementById("password").sendKeys("leaf@12");
		 driver.findElementByLinkText("Login").click();
		 System.out.println("Title: " +driver.getTitle());
		 
		 driver.findElementByLinkText("Log Out").click();
		 driver.close();
		 		 

	}

}



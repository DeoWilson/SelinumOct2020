package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1RadioButtons {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.findElementById("yes").click();
		boolean selected = driver.findElementByXPath("//input[@name='news' and @value='0']").isSelected();
		if (selected == true) {
			System.out.println("The Default selected is: UnChecked");
			
		}
		boolean selected1 = driver.findElementByXPath("//input[@name='news' and @value='1']").isSelected();
		if (selected1 == true) {
			System.out.println("The Default selected is: Checked" );
			
		}
		boolean selected2 = driver.findElementByXPath("//input[@name='age' and @value='1']").isSelected();
		if (selected2 == true) {
			System.out.println("Already Selected");
			
		}
		else {
			driver.findElementByXPath("//input[@name='age' and @value='1']").click();
		}
		

	}

}

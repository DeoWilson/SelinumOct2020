package week2.day2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1CheckBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input[@type ='checkbox'])[1]").click();
		driver.findElementByXPath("(//input[@type ='checkbox'])[3]").click();
		driver.findElementByXPath("(//input[@type ='checkbox'])[4]").click();
		driver.findElementByXPath("(//input[@type ='checkbox'])[5]").click();
		boolean selected = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']//following::input[1]").isSelected();
		if(selected == true) {
			System.out.println("Selected");
		}
		else {
			System.out.println("Not Selected");
		}
		
		boolean selected2 = driver.findElementByXPath("//label[text()='DeSelect only checked']//following::input[1]").isSelected();
		if(selected2 == true) {
			driver.findElementByXPath("//label[text()='DeSelect only checked']//following::input[1]").click();
		}
		boolean selected3 = driver.findElementByXPath("//label[text()='DeSelect only checked']//following::input[2]").isSelected();
		if(selected3 == true) {
			driver.findElementByXPath("//label[text()='DeSelect only checked']//following::input[2]").click();
		}
		
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']//following::input[1]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']//following::input[2]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']//following::input[3]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']//following::input[4]").click();
		driver.findElementByXPath("//label[text()='Select all below checkboxes ']//following::input[5]").click();
		
		

	}

}

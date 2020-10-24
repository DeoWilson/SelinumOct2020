package week2.day2.assignments;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1ListBoxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		WebElement s1 = driver.findElementById("dropdown1");
		Select dropdown = new Select(s1);
	    dropdown.selectByIndex(1);
	    
	    
	    WebElement s2 = driver.findElementByName("dropdown2");
		Select dropdown1 = new Select(s2);
	    dropdown1.selectByVisibleText("Selenium");
	    
	    
	    WebElement s3 = driver.findElementById("dropdown3");
		Select dropdown2 = new Select(s3);
	    dropdown2.selectByVisibleText("Selenium");
	    
	    
	    WebElement s4 = driver.findElementByClassName("dropdown");
	    Select dropdown3 = new Select(s4);
	    List<WebElement> options = dropdown3.getOptions();
	    System.out.println("The size: " +(options.size()-1));
	    
        WebElement s5 =driver.findElementByXPath("(//div[@class='example']/following::select)[4]");
        s5.sendKeys(Keys.ARROW_DOWN);
        s5.sendKeys(Keys.ENTER);
        
        WebElement s6 = driver.findElementByXPath("(//div[@class='example']/following::select)[5]");
		Select dropdown4 = new Select(s6);
	    dropdown4.selectByVisibleText("Selenium");
	                
	    
	    
	    
	    
	    		

	}

}

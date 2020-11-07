package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainDuplicate {

	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);
		
		driver.findElementById("chkSelectDateOnly").click();
		
		Thread.sleep(2000);
		
		List<String> trainNames = new ArrayList<String>();
		
		int rowCount = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr").size();
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
			trainNames.add(text);
				
		}
		
		int listSize = trainNames.size();
		
		Set<String> setTrainNames = new LinkedHashSet<String>(trainNames);
		
		int setSize = setTrainNames.size();
		
		if(listSize == setSize) {
			System.out.println("there is no duplicate");
		}
		else {
			System.out.println("there are duplicates");
		}		
		
		

	}

}
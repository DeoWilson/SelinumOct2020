package week4.day1.Assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement src = driver.findElementById("draggable");
		WebElement des = driver.findElementById("droppable");
		Actions act =new Actions(driver);
		act.dragAndDrop(src, des).perform();
		Thread.sleep(3000);
		String text = des.getText();
		String text1 = "Dropped!";
		if(text.equalsIgnoreCase(text1)) {
			System.out.println("Successfully dragged");
		}
		else {
			System.out.println("Not Dragged");
		}
		

	}

}

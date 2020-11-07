package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryItbutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()= 'Try it']").click();
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("Micheal");
		Thread.sleep(3000);
		alrt.accept();		
		String text = driver.findElementByXPath("//p[@id='demo']").getText();
		String text1= "Hello Micheal! How are you today?";
		if(text.equalsIgnoreCase(text1)) {
			System.out.println("Sucess");
		}
		else {
			System.out.println("Not updated");
		}
		
		
	}

}

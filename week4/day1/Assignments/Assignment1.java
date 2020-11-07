package week4.day1.Assignments;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		int sizeoftheRow = driver.findElementsByXPath("//table[@id='table_id']//tr").size();
		System.out.println("The Total number of Rows available: " +sizeoftheRow);
		int sizeoftheheadercolumn = driver.findElementsByXPath("//table[@id='table_id']//tr[1]/th").size();
		System.out.println("The Total number of Header column available: " +sizeoftheheadercolumn);
		
		for(int i=2; i<=sizeoftheRow; i++) {
			int sizeofthecolumns = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td").size();
			System.out.println("Total number of coulmn in the" + i+ "th Row is:" +sizeofthecolumns);
			}
		
		for(int z=1; z<=sizeoftheRow-1; z++) {
			String text1 = driver.findElementByXPath("(//table[@id='table_id']//tr/td[1])["+z+"]").getText();
			String text = "Learn Locators";
			if(text1.equalsIgnoreCase(text)) {
				String text2 = driver.findElementByXPath("(//table[@id='table_id']//tr/td[2])["+z+"]").getText();
				System.out.println("the Progress Value is: " +text2);
			}
			
		}
		 for(int y=1; y<sizeoftheRow; y++) {
			 driver.findElementByXPath("(//input[@type='checkbox'])["+y+"]").click();
		 }
		

	}

}

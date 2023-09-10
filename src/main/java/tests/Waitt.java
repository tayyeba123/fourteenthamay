package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitt {

	
	public void test() {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		List<WebElement> elements=driver.findElements(By.tagName("a"));
		
		for(WebElement e:elements) {
			System.out.println(e.getText());
		}
	}

}

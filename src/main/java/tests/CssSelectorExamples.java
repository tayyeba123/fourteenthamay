package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExamples {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#email")).sendKeys("Testing");
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("Selenium");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector("input.gNO89b")).click();
		By obj=By.cssSelector("input.gNO89b");
		WebElement element=driver.findElement(obj);
		element.click();
	}

}

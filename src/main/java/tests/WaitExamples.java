package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExamples {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://app.testproject.io/");
		//Implicit wait - Global wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		
	}

}

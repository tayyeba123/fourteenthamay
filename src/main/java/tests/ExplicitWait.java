package tests;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new SafariDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//Explit Wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(By.className("gNO89b")));
		
		
		driver.findElement(By.className("gNO89b")).click();
		
//		driver.navigate().to("https://app.testproject.io/");
//		System.out.println(driver.getTitle());
//		wait.until(ExpectedConditions.titleIs("TestProject - Login"));
//		System.out.println(driver.getTitle());
		
	}

}

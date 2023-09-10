package tests;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://phppot.com/demo/load-dynamic-content-using-jquery-ajax/");
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30)); //500 mill seconds
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
				  .ignoring(NoSuchElementException.class);//10*3 times=30 sec duration
															//5*6=30
		
		driver.findElement(By.xpath("//input[@id='page-3']")).click();
		driver.findElement(By.xpath("//input[@id='page-1']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[@src='LoaderIcon.gif']")));
		driver.findElement(By.xpath("//h3[text()='Home']")).click();
	}

}

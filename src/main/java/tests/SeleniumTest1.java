package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest1 {

	public static void add(Integer i) {
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		//ChromeDriver driver=new ChromeDriver();
//		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.className("EM1Mrb")).click();


		driver.manage().window().maximize();
		
//		By searchInput=By.name("q");  // To provide a google map to the FindElements method
//		WebElement searchInputField=driver.findElement(searchInput);
//		searchInputField.sendKeys("Edureka Testing");
		
		driver.findElement(By.name("q")).sendKeys("Edureka Testing");
		Thread.sleep(3000);
		
		driver.findElement(By.className("gNO89b")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("jksldfjljf@lsjfldj.com");
		driver.findElement(By.id("pass")).sendKeys("sfsdfsfdf");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.partialLinkText("Find your account")).click();
		driver.findElement(By.id("identify_email")).sendKeys("forgot@ksjlfdsjf");
		
		//driver.close(); //This will close only the current window.
		driver.quit(); //Close all tabs and popups/new windows of the browser
	}

}

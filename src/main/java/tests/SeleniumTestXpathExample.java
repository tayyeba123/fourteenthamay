package tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTestXpathExample {

	public static void add(Integer i) {
		
	}
	@Test
	public void Test1() throws InterruptedException {
		
		
		//ChromeDriver driver=new ChromeDriver();
//		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		//EdgeDriver a=new EdgeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		
//		By searchInput=By.name("q");  // To provide a google map to the FindElements method
//		WebElement searchInputField=driver.findElement(searchInput);
//		searchInputField.sendKeys("Edureka Testing");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Edureka Testing");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("jksldfjljf@lsjfldj.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sfsdfsfdf");
		//driver.findElement(By.xpath("//button[contains(@id, 'u_0_5')]")).click();
		driver.findElement(By.xpath("//button[starts-with(@id, 'u_0_5')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find your account')]")).click();
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("forgot@ksjlfdsjf");
		
		//driver.close(); //This will close only the current window.
		driver.quit(); //Close all tabs and popups/new windows of the browser
	}

}

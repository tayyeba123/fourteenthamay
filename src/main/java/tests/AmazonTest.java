package tests;

import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();


		driver.get("https://www.amazon.in");
		String title=driver.getTitle();
		String browserURL=driver.getCurrentUrl();
		String pageSource=driver.getPageSource();
		
		System.out.println("Title:="+title);
		System.out.println("Current URL of the browser:="+browserURL);
		//System.out.println("Page source:="+pageSource);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
		Thread.sleep(5000);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.xpath("//div[@data-index='5']//a")).click();
		List<WebElement> searchResults=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		System.out.println("no of serach results:="+searchResults.size());
		for(WebElement e:searchResults) {
			System.out.println(e.getText());
			String searchText=e.getText();
			if(searchText.contains("iphone 14")) {
				System.out.println("Successs");
			}
			else {
				System.out.println("Failed");
			}
		}
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();

	}

}

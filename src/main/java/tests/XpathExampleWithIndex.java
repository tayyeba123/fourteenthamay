package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExampleWithIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@id='rso']/div[4]//a")).click();
		driver.findElement(By.xpath("//div[@id='rso']/div[4]")).click();
	
	}

}

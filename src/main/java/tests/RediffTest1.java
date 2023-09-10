package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffTest1 {
	
	public static void main(String args[]) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.className("moneyicon")).click();
		//driver.findElement(By.xpath("//a[@class='moneyicon relative']")).click();
		
	}

}

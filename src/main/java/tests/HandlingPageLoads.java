package tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPageLoads {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();


		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.get("https://www.javatpoint.com/selenium-tutorial");
	}

}

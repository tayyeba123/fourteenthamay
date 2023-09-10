package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeExamples {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String value=driver.findElement(By.id("email")).getAttribute("aria-label");
		String fontSize=driver.findElement(By.id("email")).getCssValue("font-size");
		System.out.println("Aria-label of the field is:="+value);
		System.out.println("Font size:="+fontSize);
		Point p=driver.findElement(By.id("email")).getLocation(); //Ctrl+Shift+O for import
		System.out.println(p.x);
		System.out.println(p.y);
		Dimension d=driver.findElement(By.id("email")).getSize();
		System.out.println(d.height);
		System.out.println(d.width);
		String tagName=driver.findElement(By.id("email")).getTagName();
		System.out.println("Tag name:="+tagName);
	}

}

package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamiccontent {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_content");
		WebElement dynamic = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]/a"));
		
		Thread.sleep(1000);
		dynamic.click();
	}

}

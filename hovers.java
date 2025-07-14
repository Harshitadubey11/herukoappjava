package day1project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hovers {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		Actions actions = new Actions(driver);
		List<WebElement> user = driver.findElements(By.cssSelector("#content"));
		for(WebElement users:user) {
			actions.moveToElement(users).perform();
			Thread.sleep(2000);
		}
	}

}

package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select dd = new Select(dropdown);
		dd.selectByVisibleText("Option 1");
		Thread.sleep(1000);
		dd.selectByVisibleText("Option 2");
		Thread.sleep(1000);
		
	}

}

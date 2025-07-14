package day1project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class infinitescroll {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		Actions act = new Actions(driver);
		for (int i = 0; ; i++) {
			act.sendKeys(Keys.PAGE_DOWN).build().perform();  
		
	}
}}

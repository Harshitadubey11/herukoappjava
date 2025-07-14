package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class floatingmenu {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/floating_menu");
		WebElement navbar = driver.findElement(By.id("menu"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scroll(0,250)");
		System.out.println("Navbar CSS position: " + navbar.getCssValue("position"));
		// Get navbar's location before scrolling
		Point beforeScroll = navbar.getLocation();
		System.out.println("Before Scroll - X: " + beforeScroll.getX() + ", Y: " + beforeScroll.getY());

		// Scroll down
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 300)");
		Thread.sleep(2000);

		// Get navbar's location after scrolling
		Point afterScroll = navbar.getLocation();
		System.out.println("After Scroll - X: " + afterScroll.getX() + ", Y: " + afterScroll.getY());

		if (beforeScroll.getY() == afterScroll.getY()) {
			System.out.println("Navbar is floating (did not move on scroll).");
		} else {
			System.out.println("Navbar is not floating (moved with scroll).");
		}
//		if(navbar.getCssValue("position").equals("fixed")) {
//			System.out.println("Navbar is floating");
//		}
//		else {
//			System.out.println("Navbar is not floating");
//		}
		
		
		;
	}

}

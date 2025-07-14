package day1project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextmenu {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement element = driver.findElement(By.id("hot-spot"));
		Actions act = new Actions(driver); //Actions is used for advanced user actions like hover, drag-and-drop, right-click.
		act.contextClick(element).perform(); //contextClick(element) means: right-click on the specific element.perform() executes the action
		Alert popup = driver.switchTo().alert(); //driver.switchTo().alert() lets you control it .accept() clicks OK on that alert.
		popup.accept();
		
		
	}

}

package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputs {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		WebElement input = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
		input.sendKeys("1234");
		input.clear();
		input.sendKeys("5678");
		input.sendKeys(Keys.ARROW_UP);
	}

}

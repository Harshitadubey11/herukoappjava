package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class horizontalslider {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/horizontal_slider");
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
		for(int i = 1; i<=10 ; i++) {
			Thread.sleep(1000);
			slider.sendKeys(Keys.ARROW_RIGHT);
			
		}
		
	}

}

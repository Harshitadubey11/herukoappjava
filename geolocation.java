package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class geolocation {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/geolocation");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"map-link\"]/a")).click();
		
	}
}

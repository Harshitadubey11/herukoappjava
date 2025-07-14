package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamiccontrols {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		driver.findElement(By.id("checkbox")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		
	}
	

}

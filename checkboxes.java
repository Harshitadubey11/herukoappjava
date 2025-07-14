package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
		Thread.sleep(1000);
		driver.quit();
	}

}

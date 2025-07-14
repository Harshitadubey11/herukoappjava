package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challengingdom {
	public static void main(String arg[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/challenging_dom");
		Thread.sleep(1000);
		WebElement obj1 = driver.findElement(By.xpath("//*[@id=\"5d7c3d40-2dd2-013e-1084-52d5d204ea2a\"]"));
		Thread.sleep(1000);
		obj1.click();
		obj1.click();

		
	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//*[@id=\"15beefc0-2916-013e-b89d-1e36e283f2e5\"]")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//*[@id=\"15bf0e40-2916-013e-b89e-1e36e283f2e5\"]")).click();

}
}
	

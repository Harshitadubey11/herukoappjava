package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class adddelete {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		//driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();
		
		//Add Element
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).click();
		Thread.sleep(2000);
		
		
		
	}

}

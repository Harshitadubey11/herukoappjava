package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		driver.get("https://the-internet.herokuapp.com/frames");

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/button")).click();
		
	}

}

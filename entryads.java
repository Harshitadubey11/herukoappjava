package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class entryads {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/entry_ad");
		driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
		
	
	}

}

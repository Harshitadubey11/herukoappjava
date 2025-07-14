package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exitintent {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/exit_intent");
		driver.findElement(By.xpath("//*[@id=\"ouibounce-modal\"]/div[2]/div[3]/p")).click();
        Actions act = new Actions(driver);
        
        int x = 650; // Example x-coordinate
        int y = 85;  // Example y-coordinate

	}

}

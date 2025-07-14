package day1project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptalert {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//For JS Alert...............
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(500);
		//driver.switchTo().alert() → tells Selenium://“Switch focus from the main page to the currently active JavaScript alert pop-up.”
		System.out.println("Simple alert text;" + simpleAlert.getText());
		simpleAlert.accept();	
		Thread.sleep(500);
		
		//For JS CONFIRM................
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(500);
		System.out.println("Confirm Alert Text:"+ confirmAlert.getText());
		confirmAlert.dismiss();
		//.dismiss() simulates clicking the "Cancel" button on the confirmation alert.
		Thread.sleep(500);
		
		
		//For JS Prompt
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println("Prompt Alert Text:"+promptAlert.getText());
		promptAlert.sendKeys("Okie");
		promptAlert.accept();
		Thread.sleep(1000);	
	}

}

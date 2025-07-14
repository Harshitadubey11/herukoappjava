package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotpassword {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/forgot_password");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abc@gmail.com");
		driver.findElement(By.id("form_submit")).click();
		Thread.sleep(2000);
		
		
		
		
	}

}

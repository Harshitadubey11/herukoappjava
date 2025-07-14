package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class formauthentication {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith ");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
	}

}

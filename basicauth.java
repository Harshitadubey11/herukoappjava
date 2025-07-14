package day1project;

import org.openqa.selenium.chrome.ChromeDriver;

public class basicauth {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);
		driver.close();
	}

}

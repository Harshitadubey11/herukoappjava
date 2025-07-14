package day1project;

import org.openqa.selenium.chrome.ChromeDriver;

public class digestauthentication {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/digest_auth");
	}

}

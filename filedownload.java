package day1project;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class filedownload {
	public static void main(String args[]) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(("https://the-internet.herokuapp.com/download"));
		WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
		text.click();
	}
}

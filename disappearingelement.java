package day1project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class disappearingelement {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a")).click();
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");

//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a")).click();
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");

//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/a")).click();
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");

//		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[9]/a")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[4]/a")).click();
		Thread.sleep(1000);
	    
	}

}

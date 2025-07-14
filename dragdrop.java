package day1project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		WebElement element_A = driver.findElement(By.xpath("//*[@id=\"column-a\"]"));
		WebElement element_B =  driver.findElement(By.xpath("//*[@id=\"column-b\"]"));
		
		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(element_A, element_B).perform();
		 
		 Thread.sleep(2000);
		 
		 act.dragAndDrop(element_B, element_A).perform();
		 
		 Thread.sleep(2000);
		
		driver.close();
		
		
	}

}

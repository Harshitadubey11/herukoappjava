package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypresses {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses?");
        WebElement inputField = driver.findElement(By.id("target"));

        // Send the Enter key
        inputField.sendKeys(Keys.ENTER);

        // Wait briefly so the page updates
        Thread.sleep(1000);

        // Find the result element and print the text
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("Result text after enter: " + result.getText());
      
        //Refetch the input field before using again
        inputField = driver.findElement(By.id("target"));
        // Send another key, e.g., letter 'A'
        inputField.sendKeys("A");
        Thread.sleep(500);
        
        result = driver.findElement(By.id("result"));
        System.out.println("Result after pressing A: " + result.getText());

        // Close browser
        driver.quit();
    }
}		
//		WebElement text = driver.findElement(By.xpath("//*[@id=\"target\"]"));
		//text.sendKeys("Hello,I am Learning Selenium");
//		Thread.sleep(1000);
//		text.sendKeys(Keys.ENTER);
//		WebElement result = driver.findElement(By.id("result"));
//		System.out.println("Result text:"+result.getText());		
//	}
//}

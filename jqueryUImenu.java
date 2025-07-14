package day1project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jqueryUImenu {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
		//driver.switchTo().frame(driver.findElement(By.cssSelector("#menu")));
		WebElement enabled = driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]"));
		WebElement downloads = driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]"));		
		WebElement csv = driver.findElement(By.xpath("//*[@id=\"ui-id-6\"]"));		
		Actions actions = new Actions(driver);
		actions.moveToElement(enabled).perform();
		Thread.sleep(500);
		actions.moveToElement(downloads).perform();
		Thread.sleep(500);
		actions.moveToElement(csv).click().perform();
	}

}
//package day1project;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class jqueryUImenu {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://the-internet.herokuapp.com/jqueryui/menu");
//
//        // Find all iframes
//        List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//        System.out.println("Number of iframes found: " + iframes.size());
//
//        // Print details about each iframe
//        for (int i = 0; i < iframes.size(); i++) {
//            WebElement iframe = iframes.get(i);
//            System.out.println("Iframe #" + (i+1));
//            System.out.println("  class: " + iframe.getAttribute("class"));
//            System.out.println("  name: " + iframe.getAttribute("name"));
//            System.out.println("  src: " + iframe.getAttribute("src"));
//            System.out.println("----------------------");
//        }
//
//        driver.quit();
//    }
//}


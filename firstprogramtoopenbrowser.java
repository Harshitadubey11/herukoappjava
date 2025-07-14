package day1project;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogramtoopenbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser
		ChromeDriver driver = new ChromeDriver();
		//open URL
		driver.get("https://the-internet.herokuapp.com/");
		
		//check the title or validate the title "The Internet"
		String title = driver.getTitle();
		if(title.equals("The Internet")){
			System.out.print("Test Passed");
		}
		else {
			System.out.print("test failed");
		}
		
		//Threadtime(2000);
		//close the browser
		
		//driver.close();		
		
		
		
		

	}

}

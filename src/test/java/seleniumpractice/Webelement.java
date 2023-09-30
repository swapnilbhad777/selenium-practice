package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
		System.out.println(driver.getTitle());
		
		String s1=driver.getTitle();
		System.out.println(s1);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.youtube.com/");

	}

}

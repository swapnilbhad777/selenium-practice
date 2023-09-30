package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrist {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		String s=driver.getCurrentUrl();
		System.out.println(s);
		
		//System.out.println(driver.getTitle());
		String s1=driver.getTitle();
		System.out.println(s1);
        
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(2000);
		String s2=driver.getCurrentUrl();
		System.out.println(s2);
		
		String s3=driver.getTitle();
		System.out.println(s3);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
	//	driver.switchTo().alert().accept();
		
		String alertText=driver.switchTo().alert().getText();
		
       System.out.println(alertText);
       Thread.sleep(3000);
       
       driver.switchTo().alert().dismiss();
       
       driver.close();
       
       
       
       
       
	}

}

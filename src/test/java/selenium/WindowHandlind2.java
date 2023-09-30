package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlind2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		Set<String> a=driver.getWindowHandles();
		Iterator<String> t=a.iterator();
		
		String parent_window=t.next();
		String child_window=t.next();
		Thread.sleep(3000);
		
		driver.switchTo().window(child_window);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='https://www.qaclickacademy.com/blog']")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent_window);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}

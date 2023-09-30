package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		Set<String> obj=driver.getWindowHandles();
		Iterator<String> it=obj.iterator();
		
		String parent_window=it.next();
		String child_window=it.next();
		Thread.sleep(3000);
		
		driver.switchTo().window(child_window);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='about.html'][1]")).click();
		Thread.sleep(3000);
		
		driver.switchTo().window(parent_window);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		

	}

}

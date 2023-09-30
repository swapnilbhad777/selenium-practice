package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPreactice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());
		Thread.sleep(3000);
		
		WebElement e =d.findElement(By.tagName("input"));
		e.click();
		e.sendKeys("hanuman chalisa");
		Thread.sleep(3000);
		
		WebElement e1=d.findElement(By.id("search-icon-legacy"));
		e1.click();
		Thread.sleep(3000);
		
		d.findElement(By.tagName("a"));
		
		d.findElement(By.linkText("//*[@id=\"video-title\"]")).click();
		
		
	}

}

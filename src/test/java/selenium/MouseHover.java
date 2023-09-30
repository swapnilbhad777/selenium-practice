package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		Thread.sleep(2000);
		
		WebElement fname=driver.findElement(By.xpath("//input[@name='firstname']"));
		
		WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(2000);
		
		fname.sendKeys("roshan");
		Thread.sleep(2000);
		fname.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		fname.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		fname.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		lname.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		lname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		lname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		lname.sendKeys(Keys.ARROW_LEFT);
		Thread.sleep(2000);
		lname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);
		lname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);
		lname.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(2000);
		lname.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		lname.sendKeys(Keys.DELETE);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}


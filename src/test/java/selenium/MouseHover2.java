package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		
		WebElement e=driver.findElement(By.xpath("//button[@id='mousehover']"));
		Thread.sleep(2000);
		
		Actions a= new Actions(driver);
		
		a.moveToElement(e).build().perform();
		Thread.sleep(2000);
		
		WebElement top=driver.findElement(By.xpath("//a[@href='#top']"));
		top.click();
		Thread.sleep(2000);
		
		driver.quit();
		


	}

}

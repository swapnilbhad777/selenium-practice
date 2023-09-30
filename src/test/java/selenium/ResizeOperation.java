package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		Thread.sleep(3000);
		
		WebElement s =driver.findElement(By.xpath(""));

		Thread.sleep(3000);
		
		Actions a=new Actions(driver);
		
		a.clickAndHold(s).moveToElement(s, 100, 120).build().perform();
		
		
		

	}

}

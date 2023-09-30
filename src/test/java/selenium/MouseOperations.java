package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("");
		Thread.sleep(3000);

		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("")); // main content
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.contextClick(e).build().perform();
		
		WebElement e1 = driver.findElement(By.xpath(""));
		
		



	}

}

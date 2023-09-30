package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());// to get urrent url on console
		System.out.println(driver.getTitle());// to get current titile of webpage

		WebElement e=driver.findElement(By.className("gLFyf"));
		e.click();
		Thread.sleep(2000);
		e.sendKeys("jay shree ram");
		Thread.sleep(2000);

		WebElement e1=driver.findElement(By.className(""));
		e1.click();

		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();




	}

}

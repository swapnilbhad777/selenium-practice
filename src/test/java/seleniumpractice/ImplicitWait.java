package seleniumpractice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver(); 
		driver.get("https://login.salesforce.com/?locale=in");

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));

		WebElement un=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		un.sendKeys("ram charan");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));

		WebElement pwd=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pwd.sendKeys("pass777");

		driver.close();

	}

}

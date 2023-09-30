package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		Thread.sleep(3000);
		
	WebElement s=driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'][1]"));
	s.click();
	Thread.sleep(3000);
	
	WebElement s1=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span"));
    s1.click();
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//input[@id=\"autosuggest']"));
		e.click();
		e.sendKeys("ind");
		Thread.sleep(3000);
		e.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		e.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.quit();
	}

}

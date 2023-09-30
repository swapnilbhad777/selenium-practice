package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		Thread.sleep(3000);
		
		List<WebElement> a=driver.findElements(By.xpath(""));
		
		for(int i=0; i<a.size(); i++)
		{
			a.get(i).click();
		}

		Thread.sleep(3000);
		
		for(WebElement b:a)
		{
			b.click();
		}
		
		
	}

}

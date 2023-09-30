package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutosuggestiveD1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();  // lauch the browser
		d.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(3000);
		
		WebElement e=d.findElement(By.xpath("//input[@id='autosuggest']"));
		e.click();
	//	e.sendKeys("ind");  //it is responsible to enter test data
	//	Thread.sleep(3000);
	//	e.sendKeys(Keys.ARROW_DOWN);
	//	Thread.sleep(3000);
	//	e.sendKeys(Keys.ARROW_DOWN);
	//	Thread.sleep(3000);
	//	e.sendKeys(Keys.ENTER);
	//	Thread.sleep(2000);
		List<WebElement> a=d.findElements(By.xpath("//a[@class='ui-corner-all']"));
		for(WebElement k:a)
		{
			if(k.getText().equalsIgnoreCase("india"));
			{
				k.click();
				break;
					
			}
		}
     Thread.sleep(3000);
     d.close();
	}

}

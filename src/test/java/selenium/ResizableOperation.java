package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ResizableOperation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d =new ChromeDriver();
		d.get("https://jqueryui.com/resizable/");
		Thread.sleep(3000);
		
		d.manage().window().maximize();
		
		d.switchTo().frame(0);
		
		WebElement e=d.findElement(By.xpath("//*[id=\\\"resizable'\\\"]/div[3]\""));
		
		Thread.sleep(2000);
		Actions a =new Actions(d);
		
		a.clickAndHold(e).moveToElement(e, 100, 120).build().perform();
		
		
		
		
		
	}

}

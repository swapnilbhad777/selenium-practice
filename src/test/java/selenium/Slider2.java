package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver d=new ChromeDriver();
		d.get("https://jqueryui.com/slider/");
		Thread.sleep(1000);
		
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.switchTo().frame(0);
		Thread.sleep(1000);
		
		WebElement slider=d.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		
		Actions a=new Actions(d);
		Thread.sleep(1000);
		
		a.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
		Thread.sleep(1000);
		d.close();

	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderColorPicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		Thread.sleep(3000);
		 driver.manage().window().maximize();
		 
		 driver.switchTo().frame(0);
		 Thread.sleep(3000);
		 
		 WebElement red= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		 Thread.sleep(3000);
		 
		 Actions a=new Actions(driver);
		 a.clickAndHold(red).moveByOffset(-80, 0).release().build().perform();
		 Thread.sleep(3000);
		 
		 WebElement green=driver.findElement(By.xpath("/html/body/div[2]/span"));
		 Thread.sleep(3000);
		 a.clickAndHold(green).moveByOffset(40, 0).release().build().perform();
		 Thread.sleep(3000);
		 
		 WebElement blue=driver.findElement(By.xpath("/html/body/div[3]/span"));
		 Thread.sleep(3000);
		 a.clickAndHold(blue).moveByOffset(80, 0).release().build().perform();
		 Thread.sleep(3000);
		 
		 driver.close();
		 
		 
		 
		 

	}

}

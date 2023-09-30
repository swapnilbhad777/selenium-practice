package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
     Thread.sleep(3000);
     
     driver.manage().window().maximize();
     driver.switchTo().frame(0);
     Thread.sleep(2000);
     WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
     
     Actions a=new Actions(driver);
     Thread.sleep(2000);
     a.clickAndHold(slider).moveByOffset(100, 0).release().build().perform();
     
     
	}

}

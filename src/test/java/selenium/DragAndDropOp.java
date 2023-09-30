package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropOp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
     Thread.sleep(3000);
     
   //  driver.switchTo().frame(0);
  //   WebElement f1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
     driver.switchTo().frame(1);
     
     WebElement sourceElement=driver.findElement(By.xpath("//div[id='draggable']"));
     WebElement targetElement=driver.findElement(By.xpath("//div[id='droppable']"));
     
     Actions a=new Actions(driver);
     Thread.sleep(2000);
     
  //   a.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
     
     a.dragAndDrop(sourceElement, targetElement).build().perform();
     
    
     
     
     
     
	}

}

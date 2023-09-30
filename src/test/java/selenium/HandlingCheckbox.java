package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	Thread.sleep(3000);
	
    WebElement e=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
    e.click();
	Thread.sleep(3000);
	
	System.out.println(e.isDisplayed());
	System.out.println(e.isEnabled());
	System.out.println(e.isSelected());
    Thread.sleep(3000);
    
    List<WebElement> b=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
    //for(WebElement k:b) //FRIST APPROCH
    //{
    //k.click();
    //}
	for(int i=0; i<b.size(); i++)  // 2nd approach
	{
		b.get(i).click();
		Thread.sleep(3000);
	}
	}

}

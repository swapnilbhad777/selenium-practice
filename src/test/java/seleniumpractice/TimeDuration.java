package seleniumpractice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeDuration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
	      // Thread.sleep(2000); //pause for 2 sec
		//Implicit wait
		//Global wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
       WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
       username.sendKeys("anil kapoor");
       
       WebElement passward=driver.findElement(By.xpath("//*[@id=\"password\"]"));
       passward.sendKeys("pass427");
       Thread.sleep(2000);
       driver.navigate().refresh();
       
       try
       {
    	   username.sendKeys("sanju baba");
       }
       catch(Exception e)
       {
    	 driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sanju baba");
    	 System.out.println("handel the stale reference exception succesfully");
       }
       Thread.sleep(2000);
       driver.close();
	}

}

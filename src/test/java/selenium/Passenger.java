package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passenger {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
       WebElement e = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
       e.click();
       
     //  WebElement e1= driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
      // e1.click();
     //  e1.click();
     //  e1.click();
      // Thread.sleep(3000);
       
       for(int i=0; i<=3; i++)
       {
    	   driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
       }
	}

}

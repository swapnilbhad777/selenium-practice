package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		List<WebElement> obj=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		Thread.sleep(2000);

		System.out.println(obj.size());

		for(WebElement a:obj)  //for each loop
		{
			System.out.println(a.getText());
		}

		int sum=0;
		for(int i=0; i<obj.size(); i++)
		{
			String myString=obj.get(i).getText(); // storing data in string
			sum=sum+Integer.parseInt(myString);  // 


		}
		System.out.println(sum);

		String exp=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();

		int expAmt=Integer.parseInt(exp.substring(24));

		if(sum==expAmt)
		{
			System.out.println("Amount is matching");
		}
		else
		{
			System.out.println("Amount is not matching");

		}




	}

}

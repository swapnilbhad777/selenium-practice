package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotYoutube {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		
		FileUtils.copyFile(src, new File("C:\\Users\\MRGN\\Desktop\\Screenshot\\test3.png"));
		Thread.sleep(2000);
		
		WebElement e=driver.findElement(By.xpath("//*[@id=\"inline-preview-player\"]/div[17]/div[1]"));
		
		File src1=e.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src1, new File("C:\\Users\\MRGN\\Desktop\\Screenshot\\test4.png"));
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		

	}

}

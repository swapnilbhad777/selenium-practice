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

public class ScreeshotCapture {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        Thread.sleep(2000);
        
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(src, new File("C:\\Users\\MRGN\\Desktop\\Screenshot\\test.png"));
        Thread.sleep(2000);
        
        WebElement a=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[4]/td[1]/strong"));
        
        File src1=a.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src1, new File("C:\\Users\\MRGN\\Desktop\\Screenshot\\testing.jpeg"));
        
        
        
        
	}

}

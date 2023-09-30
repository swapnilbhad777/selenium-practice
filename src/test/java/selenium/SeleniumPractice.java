package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver(); // navigate you on perticular page
		driver.get("https://www.selenium.dev/");

		Thread.sleep(3000); // stop for 3 sec or some time

		driver.manage().window().maximize(); // maximize the window

		String s = driver.getCurrentUrl(); // responsible to retrive the URL
		System.out.println(s);

		String s1= driver.getTitle();  //to get title of curent webpage 
		System.out.println(s1);

		Thread.sleep(3000);  // stop for 3 sec or some time

		driver.navigate().to("www.youtube.com"); // to open another webpage 

		driver.navigate().back(); // to go back from current page to previous webpage

		String s2= driver.getCurrentUrl();
		System.out.println(s2);
		String s3=driver.getTitle();
		System.out.println(s3);

		driver.navigate().forward();  // go to forword from current page 

		driver.navigate().refresh();  // to refresh the webpage 

	//	driver.close();   // to close the webpages 









	}

}

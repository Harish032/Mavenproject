package Mavenproject.Mavenproject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavendemo1 {

	@Test
	
	public  void Test() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        String title=driver.getTitle();
        System.out.println("this is the title "+title);
        Thread.sleep(5000);
       
        driver.close();
	}

}

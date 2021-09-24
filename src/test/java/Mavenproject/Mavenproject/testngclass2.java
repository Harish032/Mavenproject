package Mavenproject.Mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngclass2 {

	// TODO Auto-generated method stub
	
	public WebDriver driver;
		@Test
			public void Testclass01() throws InterruptedException
			{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
			driver=new ChromeDriver();
		    driver.get("https://www.google.com/");
		    Thread.sleep(5000);
		    String title=driver.getTitle();
		    System.out.println("this is the title "+title);
		    Thread.sleep(5000);
		    driver.close();
			}
		@Test
		public void Testclass02() throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004946\\Desktop\\Automation\\documentation\\chromedriver.exe");
		driver=new ChromeDriver();
	    driver.get("https://Amazon.in/");
	    Thread.sleep(5000);
	    String title=driver.getTitle();
	    System.out.println("this is the title "+title);
	    Thread.sleep(5000);
	    driver.close();
		}
		
	   

		
	}



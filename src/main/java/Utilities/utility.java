package Utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility 
{
	public static WebDriver driver =null;
	public void openBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\TAT\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}

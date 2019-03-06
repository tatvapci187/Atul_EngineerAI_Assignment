package Utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class utility 
{
	public static WebDriver driver =null;
	public void openBrowser()
	{
		DesiredCapabilities capabilities = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.setProperty("webdriver.chrome.driver", "D:\\TAT\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		// Open URL https://the-internet.herokuapp.com
		System.out.println("Enter Application URL: ");
		// String url = ;
		driver.get("https://www.google.com/");
	}

}

package TestFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.GoogleSearchPage;
import Utilities.utility;

public class SearchTest extends utility {

	private GoogleSearchPage gSearchPage = new GoogleSearchPage();

	@BeforeTest
	public void preCondition() {
		openBrowser();
	}

	@Test
	public void SearchText() {
		gSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
		gSearchPage.txtSearch.sendKeys("wedding");
		gSearchPage.lstSearch.findElements(By.tagName("li"));

		List<WebElement> tableEle = gSearchPage.lstSearch.findElements(By.tagName("li"));
		System.out.println(tableEle.size());
		

		for (int i = 0; i < tableEle.size() - 1; i++)

		{
			WebElement ulEle = tableEle.get(i);
			String name = ulEle.getText();
			System.out.println(name);

			Assert.assertTrue(name.contains("wedding"));
		}

	}
	@AfterTest
	public void postCondition()
	{
		tearDown();
	}

}

package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage 
{
	@FindBy(how = How.NAME, using = "q")
	public WebElement txtSearch ;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]")
	public WebElement lstSearch ;
	
	@FindBy(how = How.LINK_TEXT, using = "Provider Data Solution")
	public WebElement lnkProviderDataSolution ;
	
	@FindBy(how = How.XPATH, using = ".//*[@id='openedTab']/a")
	public WebElement lblMyLibrary;
	
	@FindBy(how = How.LINK_TEXT, using = "Avails Import Dashboard")
	public WebElement lnkAvailsImportDashboard ;
	
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/form/div[1]/div[1]/h4")
	public WebElement lblPopupHeader;

	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/form/div[4]/button[1]")
	public WebElement btnPopupSave;
	
	@FindBy(how = How.XPATH, using = "html/body/div[1]/div/div/form/div[6]/button")
	public WebElement btnClose;
	
	
	
}

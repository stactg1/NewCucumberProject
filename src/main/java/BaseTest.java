import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	WebDriver dr;
	public void openBrowser(string browser)
	{
		if(browser.equals("chrome"))
			System.setProperty("webdriver.chrome.driver", "/Users/water/Downloads/chromedriver");
		dr = new ChromeDriver();
	
	}
	
	
	public goToURL() {
		dr.get("https://www.eshopper24.com/");
		return new goToURL(dr);
		dr.quit();
		dr.quit():
	}

}

package stepDefinations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class Hook {
	public static WebDriver driver;
	@Before
	public void setUp()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\srinivas1\\Desktop\\Dec9amBatch\\OrangeHRMApplication_Cucumber\\browserDriverFiles\\chromedriver.exe");
	       driver = new ChromeDriver();
	       driver.manage().deleteAllCookies();
	}
	@After
	public void tearDow()
	{
		driver.close();
	}
}

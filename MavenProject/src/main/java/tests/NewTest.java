package tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() throws Exception {
	driver.navigate().to("https://www.paytm.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
 
}
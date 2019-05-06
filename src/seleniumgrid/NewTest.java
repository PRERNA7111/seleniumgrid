package seleniumgrid;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest 
{

  public WebDriver driver;
  @Parameters({"browser"})
  @Test(priority=1)
  public void openbrowser(String browser) throws MalformedURLException 
  {
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.out.println("In chrome browser");
		  DesiredCapabilities cap =  new DesiredCapabilities();
		  cap.setBrowserName("chrome");
		  //cap.setPlatform(Platform.);
		  System.setProperty("webdriver.chrome.driver","E:\\seleniumgrid\\chromedriver.exe");
		  String node="http://192.168.31.253:4444/wd/hub";
		  driver= new RemoteWebDriver(new URL(node),cap);
		  
	  } 
  }
  @Test(priority=2)
  public void enterApplicationURL() 
  {
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
  }


  


}

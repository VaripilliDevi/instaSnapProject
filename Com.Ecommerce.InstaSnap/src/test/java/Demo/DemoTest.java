package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest 
{
@Test
public void Verify() throws IOException
{
	//configure the browser
	WebDriverManager.chromedriver().setup();
	//launch the browser
	
	WebDriver driver = new ChromeDriver();
	
	//navigate to the application
	driver.get("https://www.google.com");
	Reporter.log("hi");
	WorkbookFactory.create(false);
}
}

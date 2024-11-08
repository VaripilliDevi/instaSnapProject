package Com.Ecommerce.InstaSnap.GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	@BeforeClass
	public void browserSetup()
	{
	Reporter.log("Browser launched succesfully",true);
	}
	@BeforeMethod
	public void login()
	{
	Reporter.log("Login succesfully",true);
	}
	@AfterMethod
	public void logout()
	{
	Reporter.log("LOgout succesfully",true);
	}
	
	@AfterClass
	public void terminateBrowser()
	{
	Reporter.log("Browser closed succesfully",true);
	}
	

}

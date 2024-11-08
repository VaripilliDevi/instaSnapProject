package Com.Ecommerce.InstaSnap.ProductTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class VerifyKidsProduct extends BaseTest
{

	@Test(priority = 1)
	public void createProduct()
	{
Reporter.log("kids Product Created",true);
	}

	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "createProduct")
	public void updateProduct() 
	{
		Reporter.log("kids Product Updated",true);

	}
}

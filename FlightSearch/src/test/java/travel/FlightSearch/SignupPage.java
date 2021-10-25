package travel.FlightSearch;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.base;

public class SignupPage extends base{
@BeforeTest
public void pageNavigation() throws IOException
{
	driver=InitializeBrowser();
	driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
	driver.manage().window().maximize();
}
@DataProvider(name="Dp")
public Object[][] getdata()
{
	return new Object[][] {{"Tanuja","ABC","abc@gmail.com"}};
}
@Test(dataProvider="Dp")
public void createAcc(String name,String orgName,String emailId)
{
	LandingPage lpage=new LandingPage(driver);
	lpage.chooseLanguage();
	lpage.enterName().sendKeys(name);
	lpage.enterOrgname().sendKeys(orgName);
	lpage.enterMailId().sendKeys(emailId);
	lpage.selectChkbox().click();
}
@AfterTest

public void teardown()
{
	driver.close();
}
}

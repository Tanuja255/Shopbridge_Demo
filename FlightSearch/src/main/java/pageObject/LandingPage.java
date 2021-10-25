package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	By ddl=By.xpath("//*[@id='language]/div[1]/span");
	By language=By.xpath("//[@class='ui-select-choices-row-inner']");
	By nametxt=By.xpath("//*[@id='name']");
	By orgNametxt=By.xpath("//*[@id=orgName']");
	By emailtxt=By.xpath("//*[@id='singUpEmail']");
	By chkbox=By.xpath("//label[@class='ui-checkbox']");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	
	}
	public void chooseLanguage()
	{
		WebElement dropdown=driver.findElement(ddl);
		dropdown.click();
		String[] l= {"English","Dutch"};
		String[] txt= {" "," "};
		List<WebElement>allOptions=driver.findElements(language);
		for(int i=0;i<allOptions.size();i++)
		{
			String Opt=allOptions.get(i).getText();
			if(Opt.equals(l[i]))
			{
				txt[i]=Opt;
			}
			if(i==0)
			{
				System.out.println("First drodown Value is :" +txt[i]);
			}
			if(i==1)
			{
				System.out.println("Second drodown Value is :" +txt[i]);
			}
		}
		
	}
	public WebElement enterName()
	{
		return driver.findElement(nametxt);
	}
	public WebElement enterOrgname()
	{
		return driver.findElement(orgNametxt);
	}
	public WebElement enterMailId()
	{
		return driver.findElement(emailtxt);
		
	}
	public WebElement selectChkbox()
	{
		return driver.findElement(chkbox);
	}
}

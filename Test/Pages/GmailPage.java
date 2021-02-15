package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailPage {
	
	
	public static WebElement Email(WebDriver driver) {
		System.out.println("TestDummy");
		
		
		WebDriverWait d = new  WebDriverWait(driver, 10);
		List<WebElement> NoEmails = d.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.className("bog"))));
		
		
		for (int i=0; i < NoEmails.size(); i++) {
			System.out.println("Test1");
			if(NoEmails.get(i).getText().contains("MieterEngel-Portal: Dein Log-In"))
			{
				System.out.println("testdddd");
				return NoEmails.get(i);
			}
		}
		
		return null;
	}
	
    public static WebElement ExpandButton(WebDriver driver) 
    {
    	return driver.findElement(By.className("ajT"));	
	}

	public static WebElement EinloggenButton(WebDriver driver)
	{
			return driver.findElement(By.linkText("EINLOGGEN"));
	}
}

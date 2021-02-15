package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class mieterengelPersonalDetailsPage {

	public static WebElement GenderRadioButton(WebDriver driver) {
		List<WebElement> radioButton = driver.findElements(By.className("mecl-radio-wrapper"));
		for(int i=0; i<radioButton.size(); i++)
			{
				if(radioButton.get(i).getText().contains("Frau"))
				{
					return radioButton.get(i);
				}
			
			}
		return null;
		
		
	}
	
	public static WebElement nameTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("firstName"));	
		
	}
		
	public static WebElement surnameTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("lastName"));	
		
	}
	
	public static WebElement emailTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("email"));	
		
	}
	
	public static WebElement telephoneTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("phone"));	
		
	}
	
	public static WebElement streetTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("street"));	
		
	}
	
	public static WebElement houseNoTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("houseNumber"));	
		
	}
	
	public static WebElement placeTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("city"));	
		
	}
	
	public static WebElement postcodeTextBox(WebDriver driver) 
	{
		return driver.findElement(By.name("zip"));	
		
	}
	
	public static WebElement policyCheckbox(WebDriver driver) 
	{
		return driver.findElement(By.className("payment-checkbox__button"));	
		
	}
	
	public static WebElement confirmDataButton(WebDriver driver) 
	{
		return driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div[1]/div[2]/div/button"));	
		
	}
	
	
}

package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MieterengelLogin {

//	@SuppressWarnings("unused")
//	private static WebElement TextBox =null;
//	@SuppressWarnings("unused")
//	private static WebElement Login = null;
	
    public static WebElement emailTextBox(WebDriver driver){

    	return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/form/div/div/input"));
         

    }
    
    public static WebElement LoginButton(WebDriver driver) {
    	
    	return driver.findElement(By.xpath("//*[@id='root']/div/div[1]/form/p[1]/button"));
    	    
    }

   
}

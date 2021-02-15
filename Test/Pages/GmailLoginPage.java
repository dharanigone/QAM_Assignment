package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailLoginPage {

//	@SuppressWarnings("unused")
//	private static WebElement TextBoxGmail =null;
//	@SuppressWarnings("unused")
//	private static WebElement EmailContinue = null;
//	@SuppressWarnings("unused")
//	private static WebElement Password = null;
//	@SuppressWarnings("unused")
//	private static WebElement PasswordContinue = null;
	
    public static WebElement emailTextBoxGmail(WebDriver driver){

        WebElement TextBoxGmail = driver.findElement(By.id("identifierId"));
        return TextBoxGmail;

    }
    
    public static WebElement EmailContinueButton(WebDriver driver) {
    	
    	WebElement EmailContinue = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
    	return EmailContinue;
    
    }

    public static WebElement PasswordTextBox(WebDriver driver) {
    	
    	WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
    	return Password;
    }
    
    public static WebElement PasswordContinueButton(WebDriver driver) {
    	
    	WebElement PasswordContinue = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
    	return PasswordContinue;
    }
}
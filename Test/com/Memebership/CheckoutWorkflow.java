package com.Memebership;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import Pages.MieterengelLogin;
import Pages.GmailLoginPage;
import Pages.GmailPage;
import Pages.mieterengelHomePage;
import Pages.mieterengelPersonalDetailsPage;

public class CheckoutWorkflow {
	static WebDriver driver;
	
  @Test
  public void BuyRecommendedPlan() throws InterruptedException {
	  
	  MieterengelLogin.emailTextBox(driver).click();
	  MieterengelLogin.emailTextBox(driver).clear();
	  MieterengelLogin.emailTextBox(driver).sendKeys("testqam00@gmail.com");
	  
	  MieterengelLogin.LoginButton(driver).click();
	
	  
	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	  
	  driver.get("https://mail.google.com");
	  GmailLoginPage.emailTextBoxGmail(driver).click();
	  GmailLoginPage.emailTextBoxGmail(driver).clear();
	  GmailLoginPage.emailTextBoxGmail(driver).sendKeys("testqam00@gmail.com");
	  
	  GmailLoginPage.EmailContinueButton(driver).click();
	  
	  
	  GmailLoginPage.PasswordTextBox(driver).click();
	  GmailLoginPage.PasswordTextBox(driver).clear();
	  GmailLoginPage.PasswordTextBox(driver).sendKeys("testQAM123");
	  
	  GmailLoginPage.PasswordContinueButton(driver).click();
	  
	  GmailPage.Email(driver).click();
			
	  WebDriverWait d = new  WebDriverWait(driver,10);
	  
	  
	  if(GmailPage.ExpandButton(driver).isDisplayed())
	  {
 	   
		  GmailPage.ExpandButton(driver).click();
		  GmailPage.EinloggenButton(driver).click();
	  }
	  else 
	  {
		  GmailPage.EinloggenButton(driver).click();
  	  }
	  
      driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[2]/a[3]/div")).click();
	  driver.findElement(By.xpath("//*[@id='root']/div/div[1]/div[2]/div[2]/a[6]")).click();
	  boolean m = mieterengelHomePage.RecommendedBanner(driver).isDisplayed();
	  System.out.println(m);
	  mieterengelHomePage.RecommendedBanner(driver).click();
	  
	  mieterengelPersonalDetailsPage.nameTextBox(driver).sendKeys("TestData4");
  }
	  
	  
  

@BeforeMethod
  public void GoToUrl() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Dharani\\seleniumBrowserDriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://portal.staging.mieterengel.de/ueberblick"); 
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void CloseBrowser() {
	  
	 //driver.quit();
  }
  
  

}
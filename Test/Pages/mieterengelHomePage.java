package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mieterengelHomePage {


@SuppressWarnings("unused")
private static WebElement RecommendedBanner = null;
	
	public static WebElement RecommendedBanner(WebDriver driver) {
		return driver.findElement(By.xpath("//a[conatins(@href, '/shop/checkout/basis/1/daten')]"));
	}
	
}

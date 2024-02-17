package pageObject;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	public static WebDriver driver;
	static JavascriptExecutor js;
	
	public basePage (WebDriver driver) {
		basePage.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}
	
	public static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public static WebElement explicitWait(WebElement element_name) {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return mywait.until(ExpectedConditions.visibilityOf(element_name));
	}

	public static void jsClick(WebElement jsElement) {
		js.executeScript("arguments[0].click()", jsElement);
	}

}

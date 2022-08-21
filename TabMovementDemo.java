package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class TabMovementDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "/home/muthu/Documents/Selenium/geckodriver");
		 */
System.setProperty("webdriver.gecko.driver", 
		"/home/muthu/Documents/Selenium/geckodriver");
		
		  FirefoxOptions options = new FirefoxOptions();
		  options.setCapability("marionette", false);
		 
		WebDriver driver = new FirefoxDriver();
	//	driver.get("http://www.duckduckgo.com/");
		driver.get("file:///home/muthu/Documents/seleniumnew/textbox.html");
		
		WebElement element =driver.findElement(By.linkText("Mozilla")) ;
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	      // Keys.Chord string
		String link = Keys.chord(Keys.CONTROL,Keys.ENTER);
// open the link in new tab, Keys.Chord string passed to sendKeys
	      element.sendKeys(link);
	      Thread.sleep(3000);
	      element.sendKeys(Keys.CONTROL +"\t");
	    //  element.sendKeys(Keys.TAB);
	    
		/*
		 * String firstWindow = driver.getWindowHandle();
		 * System.out.println(firstWindow);
		 * 
		 * WebElement logo = driver.findElement(By.linkText("Mozilla"));
		 * System.out.println("logo --> "+ logo);
		 * 
		 * Actions action = new Actions(driver); action.moveToElement(logo); //
		 * Thread.sleep(3000); action.moveToElement(logo) .sendKeys(Keys.CONTROL, "t");
		 */
	
		/*
		 * driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL, "1");
		 * driver.switchTo().window(firstWindow); Thread.sleep(5000);
		 */
		
	    
	    //Second approach with NumPad value
		/*
		 * new Actions(driver) .sendKeys(element, Keys.CONTROL) .sendKeys(element,
		 * Keys.NUMPAD2) .build().perform();
		 */
	}

}

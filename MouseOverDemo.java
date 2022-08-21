package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", 
				"/home/muthu/Documents/Selenium/geckodriver");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
				WebDriver driver = new FirefoxDriver();
		//String baseWebUrl = "http://www.redbus.in/";
		driver.get("http://www.redbus.in/");
		
		WebElement busHire = driver.findElement(By.id("redBus Bus Hire")); 
		// WebElement accountCreation = driver.findElement(By.xpath("//button[contains(.,'Create an account')]"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		Action mouseOverAction = actions.moveToElement(busHire).build(); 
		
		mouseOverAction.perform();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		}
		}
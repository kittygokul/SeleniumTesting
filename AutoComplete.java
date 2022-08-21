package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoComplete {

	// Auto Complete 
	static String URL = "http://jqueryui.com/autocomplete/";
	static private By frameLocator = By.className("demo-frame");
	//static private By tagText = By.id("tags");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", 
				"/home/muthu/Documents/Selenium/geckodriver");
			
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("marionette", false);
			
	WebDriver driver = new FirefoxDriver();
	
	//driver.get(URL);
	driver.manage().window().maximize();
		
	//Duration d = Duration.ofSeconds(5); 
	WebDriverWait wait = new WebDriverWait(driver, 5); 
	
	  driver.navigate().to(URL);
	  WebElement frameElement=driver.findElement(frameLocator);
	  driver.switchTo().frame(frameElement);
wait.until(ExpectedConditions.presenceOfElementLocated(By.id("tags")));
WebElement
	  textBoxElement = driver.findElement(By.id("tags"));
textBoxElement.sendKeys("ja");
	  
	  WebElement autoOptions = driver.findElement(By.id("ui-id-1"));
	  wait.until(ExpectedConditions.visibilityOf(autoOptions));
	  
	  List<WebElement> optionsToSelect =
	  autoOptions.findElements(By.tagName("li")); 
	  
	  for(WebElement option :optionsToSelect)
	  { if(option.getText().equals("Java")) 
	  {
	  System.out.println("Trying to select: Java"); 
	  option.click(); break;
	  }
	  
	  }
		 
	
	}

}

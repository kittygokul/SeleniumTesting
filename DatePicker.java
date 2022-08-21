
  package selenium;
  
  import java.text.SimpleDateFormat; 
  import java.util.Date; 
  import java.util.concurrent.TimeUnit;
  
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver; 
import
  org.openqa.selenium.firefox.FirefoxDriver;
import
  org.openqa.selenium.firefox.FirefoxOptions; 
import java.util.List;
import java.util.Set;

import
  org.openqa.selenium.WebElement;
  
  
  public class DatePicker {
  
  public static void main(String[] args) throws InterruptedException { // TODO
  //Auto-generated method stub
  
  System.setProperty("webdriver.gecko.driver",
  "/home/muthu/Documents/Selenium/geckodriver");
  
  FirefoxOptions options = new FirefoxOptions();
  options.setCapability("marionette", false);
  
  
  WebDriver driver = new FirefoxDriver();
  
  driver.get("https://jqueryui.com/datepicker/");
  WebElement element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
  driver.switchTo().frame(element); 
  element = driver.findElement(By.id("datepicker"));
  element.click();
 // driver.findElement(By.linkText("Next")).click();
  List<WebElement> s =  
		 driver.findElements(By.xpath("//table/tbody/tr/td"));
  for(WebElement e:s)
	  if(e.getText().equals("10"))
	  {
		  e.click();
		
	  }
  		
  }


}
 

  
  
 
package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.http.HttpClient;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "/home/muthu/Documents/Selenium/geckodriver");
		
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
				WebDriver driver = new FirefoxDriver();
driver.get("file:///home/muthu/Documents/seleniumnew/image.html");
List<WebElement> imagesList = driver.findElements(By.tagName("img"));
System.out.println("Total no. of images are " + imagesList.size());

	}

}
